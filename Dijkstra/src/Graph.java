
import java.util.ArrayList;


public class Graph 
{
	ArrayList<Vertex> vertexes;
	ArrayList<Edge> edges;
	
	public Graph(ArrayList<Vertex> vertexes, ArrayList<Edge> edges) 
	{
		this.vertexes = vertexes;
		this.edges = edges;
	}

	public ArrayList<Vertex> getVertexes() {
		return vertexes;
	}

	public void setVertexes(ArrayList<Vertex> vertexes) {
		this.vertexes = vertexes;
	}

	public ArrayList<Edge> getEdges() {
		return edges;
	}

	public void setEdges(ArrayList<Edge> edges) {
		this.edges = edges;
	}
	
	
	
	
}
