public class Edge {
    String name;
    Vertex v1;
    Vertex v2;
    Boolean visited;

    public Edge(String name, Vertex v1, Vertex v2) {
        this.name = name;
        this.v1 = v1;
        this.v2 = v2;
        visited = false;
    }

    public String getName() {
        return name;
    }

    public Vertex getV1() {
        return v1;
    }

    public Vertex getV2() {
        return v2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setV1(Vertex v1) {
        this.v1 = v1;
    }

    public void setV2(Vertex v2) {
        this.v2 = v2;
    }

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public Vertex opposite(Vertex v) {
        if(v.equals(v1)) return v2;
        else return v1;
    }


}
