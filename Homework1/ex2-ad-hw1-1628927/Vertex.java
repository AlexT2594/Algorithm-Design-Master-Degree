import java.util.ArrayList;
import java.util.List;

public class Vertex {
    String name;
    List<Edge> edges;
    Boolean visited;

    public Vertex(String name) {
        this.name = name;
        this.edges = new ArrayList<>();
        visited = false;
    }

    public String getName() {
        return name;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void insertEdge(Edge e) {
        edges.add(e);
    }

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vertex vertex = (Vertex) o;

        return name.equals(vertex.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
