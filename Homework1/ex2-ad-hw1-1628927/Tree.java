import java.util.ArrayList;
import java.util.List;

public class Tree {
    String root;
    ArrayList<Tree> children;
    int size;

    public Tree(String id) {
        root = id;
        children = new ArrayList<>();
    }

    public Tree(Graph g) {
        List<Vertex> vertices = g.getVertices();
        if(vertices.size() == 0) {
            this.root = null;
            this.size = 0;
            this.children = null;
        } else {
            Vertex root = vertices.get(0);
            this.root = "";
            this.children = new ArrayList<>();
            DFS(this,root);
        }
    }

    public static void DFS(Tree tree, Vertex v) {
        tree.setRoot(v.getName());
        v.setVisited(true);
        for(Edge e: v.edges) {
            if(!e.getVisited()) {
                Vertex w = e.opposite(v);
                if(!w.getVisited()) {
                    Tree child = new Tree(w.getName());
                    tree.insertChild(child);
                    e.setVisited(true);
                    DFS(child,w);
                }
            }
        }
    }

    public String getRoot() {
        return root;
    }

    public ArrayList<Tree> getChildren() {
        return children;
    }

    public int getSize() {
        return size;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void insertChild(Tree child) {
        children.add(child);
    }

    public void removeChild(Tree child) {
        children.remove(child);
    }

    public void print(String indent, Boolean last)
    {
        System.out.print(indent);
        if (last)
        {
            //System.out.print("\\-");
            System.out.print("└─");
            indent += "  ";
        }
        else
        {
            System.out.print("|-");
            indent += "| ";
        }

        System.out.println(root + ", " + size);

        for (int i = 0; i < children.size(); i++)
            children.get(i).print(indent,i == children.size() - 1);
    }

    public static int size(Tree tree) {
        if(tree.children.size() == 0) {
            tree.setSize(1);
            return 1;
        }
        int total = 1;
        for(Tree child:tree.children) {
            total += size(child);
        }
        tree.setSize(total);
        return total;
    }

    public static Tree hubConductor(Tree tree,int V) {
        for(Tree child: tree.children) {
            if(child.getSize() > V / 2) {
                return hubConductor(child,V);
            }
        }
        return tree;
    }
}
