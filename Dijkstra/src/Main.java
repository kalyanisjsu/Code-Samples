import java.util.ArrayList;
import java.util.LinkedList;


public class Main {

	static ArrayList<Vertex> nodes;
	static ArrayList<Edge> edges;
	
	public static void main(String[] args) 
	{
		 	nodes = new ArrayList<Vertex>();
		    edges = new ArrayList<Edge>();
		    for (int i = 0; i < 4; i++) 
		    {
		      Vertex location = new Vertex("Node_" + i, "Node_" + i);
		      nodes.add(location);
		    }
		    addLane("Edge_0", 0, 3, 5);
		    addLane("Edge_1", 1, 2, 2);
		    addLane("Edge_2", 0, 1, 1);
		    addLane("Edge_3", 3, 1, 4);
		    addLane("Edge_4", 3, 2, 3);

		    // Lets check from location Loc_1 to Loc_10
		    Graph graph = new Graph(nodes, edges);
		    //Djijkstra dijkstra = new Djijkstra(graph);
		    PracticeDj pd = new PracticeDj(graph);
		  //  dijkstra.execute(nodes.get(0));
		    pd.execute(nodes.get(0));
		    //ArrayList<Vertex> path = dijkstra.getPath(nodes.get(2));
		    ArrayList<Vertex> path = pd.getPath(nodes.get(2));
		    for (Vertex vertex : path) {
		      System.out.println("ID : " + vertex.getId() + " Name : " + vertex.getName() );
		    }
		    
		  }

	private static void addLane(String laneId, int sourceLocNo, int destLocNo, int duration) 
	{
		Edge lane = new Edge(laneId,nodes.get(sourceLocNo), nodes.get(destLocNo), duration);
		edges.add(lane);
	}

}
