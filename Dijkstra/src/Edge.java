
public class Edge 
{
	String edgeId;
	Vertex source, destination;
	int weight;
	
	Edge(String edgeId,Vertex source, Vertex destination, int weight)
	{
		this.edgeId = edgeId;
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	}

	public String getEdgeId() {
		return edgeId;
	}

	public void setEdgeId(String edgeId) {
		this.edgeId = edgeId;
	}


	public Vertex getSource() {
		return source;
	}

	public void setSource(Vertex source) {
		this.source = source;
	}

	public Vertex getDestination() {
		return destination;
	}

	public void setDestination(Vertex destination) {
		this.destination = destination;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
