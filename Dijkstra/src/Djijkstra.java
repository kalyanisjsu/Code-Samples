import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;


public class Djijkstra 
{
	ArrayList<Vertex> vertexes;
	ArrayList<Edge> edges;
	HashMap<Vertex, Vertex> predecessors;
	HashMap<Vertex, Integer> distance;
	HashSet<Vertex> settledNodes;
	HashSet<Vertex> unsettledNodes;
	
	public Djijkstra(Graph graph) 
	{
		this.vertexes = new ArrayList<Vertex>(graph.getVertexes());
		this.edges = new ArrayList<Edge>(graph.getEdges());		
	}
	
	public void execute(Vertex source)
	{
		System.out.println("execute");
		predecessors= new HashMap<Vertex, Vertex>();
		distance = new HashMap<Vertex, Integer>();
		settledNodes = new HashSet<Vertex>();
		unsettledNodes = new HashSet<Vertex>();
		distance.put(source, 0);
		unsettledNodes.add(source);
		while(unsettledNodes.size() > 0)
		{
			Vertex node =  getMinimum(unsettledNodes);
			settledNodes.add(node);
			unsettledNodes.remove(node);
			findminimalDistance(node);			
		}
	}
	
	public void findminimalDistance(Vertex node)
	{
		System.out.println("findminimalDistance");
		ArrayList<Vertex> adjNodes = getNeighbors(node);
		for(Vertex target : adjNodes)
		{
			if(getShortestDistance(target) > getShortestDistance(node) + getDistance(node, target))
			{
				distance.put(target,getShortestDistance(node) + getDistance(node, target) );
				predecessors.put(target, node);
				unsettledNodes.add(target);
			}
		}
	}
	
	public int getDistance(Vertex node, Vertex target)
	{
		System.out.println("getDistance");
		for(Edge edge : edges)
		{
			if(edge.getSource().equals(node) && edge.getDestination().equals(target))
			{
				return edge.getWeight();
			}
		}
		return 0;
	}
	
	public ArrayList<Vertex> getNeighbors(Vertex node)
	{
		System.out.println("getNeighbors");
		ArrayList<Vertex> neighbors = new ArrayList<Vertex>();
		for(Edge edge : edges)
		{
			if(edge.getSource().equals(node) && !isSettled(edge.getDestination()))
			{
				neighbors.add(edge.getDestination());
			}
		}
		return neighbors;
	}
	
	public boolean isSettled(Vertex v)
	{
		System.out.println("isSettled");
		return settledNodes.contains(v);
	}
	
	
	public Vertex getMinimum(HashSet<Vertex> vertexes)
	{
		System.out.println("getMinimum");
		Vertex mini = null;
		for(Vertex v:vertexes)
		{
			if(mini == null)
				mini = v;
			else
			{
				if(getShortestDistance(v) < getShortestDistance(mini))
				{
					mini = v;
				}
			}
		}
		return mini;
	}
	
	public int getShortestDistance(Vertex v)
	{
		System.out.println("getShortestDistance");
		Integer d = distance.get(v);
		if(d == null)
			return 1000;
		else
			return d;
		
	}
	
	public ArrayList<Vertex> getPath(Vertex v)
	{
		System.out.println("getPath");
		ArrayList<Vertex> path = new ArrayList<Vertex>();
		Vertex step  = v;
		if(predecessors.get(step) == null)
		{
			return null;
		}
		path.add(step);
		
		while(predecessors.get(step)!= null)
		{
			step = predecessors.get(step);
			path.add(step);
		}
		Collections.reverse(path);
		return path;
	}
	
	
}
