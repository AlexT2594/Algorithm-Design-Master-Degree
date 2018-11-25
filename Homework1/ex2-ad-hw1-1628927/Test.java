import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
       /* Tree t1 = new Tree("A");
        Tree t2 = new Tree("B");
        Tree t3 = new Tree("C");
        Tree t7 = new Tree("D");
        t1.insertChild(t2);
        t1.insertChild(t3);
        t1.insertChild(t7);

        Tree t4 = new Tree("child1 of B");
        Tree t5 = new Tree("child2 of B");
        Tree t6 = new Tree("child3 of B");

        t2.insertChild(t4);
        t2.insertChild(t5);
        t2.insertChild(t6);

        t1.print("",false);

        Tree.size(t1);

        t1.print("",false);
        Tree center = Tree.center(t1,t1.getSize());
        System.out.println("Center is: " + center.getRoot());*/


        /*Tree a = new Tree("A");
        Tree b = new Tree("B");
        Tree c = new Tree("C");
        Tree d = new Tree("D");
        Tree e = new Tree("E");
        Tree f = new Tree("F");
        Tree g = new Tree("G");
        Tree h = new Tree("H");
        Tree i = new Tree("I");
        Tree m = new Tree("M");

        a.insertChild(b);
        a.insertChild(c);
        a.insertChild(d);

        c.insertChild(e);
        c.insertChild(f);
        f.insertChild(h);
        f.insertChild(i);
        i.insertChild(m);

        d.insertChild(g);

        Tree.size(a);

        a.print("",false);
        Tree answer = Tree.center(a,a.getSize());
        System.out.println("Center is: " + answer.getRoot());


        Tree n1 = new Tree("1");
        Tree n2 = new Tree("2");
        Tree n3 = new Tree("3");
        Tree n4 = new Tree("4");
        n1.insertChild(n2);
        n2.insertChild(n3);
        n2.insertChild(n4);
        Tree n5 = new Tree("5");
        Tree n6 = new Tree("6");
        Tree n7 = new Tree("7");
        Tree n8 = new Tree("8");
        Tree n9 = new Tree("9");
        n1.insertChild(n5);
        n5.insertChild(n6);
        n5.insertChild(n7);
        n5.insertChild(n8);
        n5.insertChild(n9);

        Tree.size(n1);

        n1.print("",false);
        answer = Tree.center(n1,n1.getSize());
        System.out.println("Center is: " + answer.getRoot());*/

        Vertex a = new Vertex("a");
        Vertex b = new Vertex("b");
        Vertex c = new Vertex("c");
        Vertex d = new Vertex("d");

        Edge ab = new Edge("ab",a,b);
        Edge ac = new Edge("ac",a,c);
        Edge bd = new Edge("bd",b,d);

        a.insertEdge(ab);
        a.insertEdge(ac);
        b.insertEdge(bd);

        ArrayList<Vertex> vertices = new ArrayList<>();
        vertices.add(a);
        vertices.add(b);
        vertices.add(c);
        vertices.add(d);

        ArrayList<Edge> edges = new ArrayList<>();
        edges.add(ab);
        edges.add(ac);
        edges.add(bd);

        Graph g = new Graph("G",vertices,edges);

        Tree t = new Tree(g);

        Tree.size(t);

        t.print("",false);
        Tree answer = Tree.hubConductor(t,t.getSize());
        System.out.println("Center is: " + answer.getRoot());

    }

}
