import java.util.ArrayList;
import java.util.List;

public class Graph {
    String name;
    List<Vertex> vertices;
    List<Edge> edges;

    public Graph(String name, List<Vertex> vertices, List<Edge> edges) {
        this.name = name;
        this.vertices = vertices;
        this.edges = edges;
    }

    public String getName() {
        return name;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVertices(List<Vertex> vertices) {
        this.vertices = vertices;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }
}
