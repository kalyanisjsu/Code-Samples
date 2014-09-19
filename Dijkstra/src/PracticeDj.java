import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;


public class PracticeDj 
{
	ArrayList<Vertex> vertexes;
	ArrayList<Edge> edges;
	HashMap<Vertex, Vertex> predecessors;
	HashMap<Vertex, Integer> distance;
	HashSet<Vertex> unsettled;
	HashSet<Vertex> settled;
	
	public PracticeDj(Graph graph)
	{
		vertexes = graph.getVertexes();
		edges = graph.getEdges();
		
	}
	
	public void execute(Vertex source)
	{
		predecessors = new HashMap<Vertex, Vertex>();
		distance = new HashMap<Vertex, Integer>();
		unsettled = new HashSet<Vertex>();
		settled = new HashSet<Vertex>();
		distance.put(source, 0);
		unsettled.add(source);
		
		while(unsettled.size() > 0)
		{
			Vertex node = getMinimum(unsettled);
			settled.add(node);
			unsettled.remove(node);
			findMinimalDistance(node);
		}
	}
	
	public void findMinimalDistance(Vertex source)
	{
		ArrayList<Vertex> neighbors = getNeighbors(source);
		for(Vertex target : neighbors)
		{
			if(getShortestDistance(target) > getShortestDistance(source) + getDistance(source, target))
			{
				distance.put(target, getShortestDistance(source) + getDistance(source, target));
				predecessors.put(target, source);
				unsettled.add(target);
			}
		}
	}
	
	public int getDistance(Vertex src, Vertex tar)
	{
		for(Edge e : edges)
		{
			if(e.getSource().equals(src) && e.getDestination().equals(tar))
			{
				return e.getWeight();
			}
		}
		return 0;
	}
	
	public ArrayList<Vertex> getNeighbors(Vertex src)
	{
		ArrayList<Vertex> adj = new ArrayList<Vertex>();
		for(Edge edge : edges)
		{
			if(edge.getSource().equals(src) && !isSettled(edge.getDestination()))
			{
				adj.add(edge.getDestination());
			}
		}
		return adj;
	}
	
	public boolean isSettled(Vertex v)
	{
		return settled.contains(v);
	}
	
	public Vertex getMinimum(HashSet<Vertex> vertexes)
	{
		Vertex mini = null;
		for(Vertex vr: vertexes)
		{
			if(mini == null)
			{
				mini = vr;
			}
			else if(getShortestDistance(vr) < getShortestDistance(mini))
			{
				mini = vr;
			}
		}
		return mini;
	}
	
	public int getShortestDistance(Vertex v)
	{
		Integer d = distance.get(v);
		if(d == null)
		{
			return Integer.MAX_VALUE;
		}
		else
			return d;
	}
	
	public ArrayList<Vertex> getPath(Vertex v)
	{
		Vertex s = v;
		ArrayList<Vertex> path = new ArrayList<Vertex>();
		
		if(predecessors.get(v) == null)
		{
			return null;
		}
		path.add(s);
		
		while(predecessors.get(s)!= null)
		{
			s = predecessors.get(s);
			path.add(s);
		}		
		System.out.println(path.size());
		Collections.reverse(path);
		return path;
	}
	
	
}
