
import java.util.LinkedList;
import java.util.Queue;


public class StackUsing2Queue {	
	
	Queue<Integer> que1;
	Queue<Integer> que2;
	
	public StackUsing2Queue() 
	{
		que1 = new LinkedList<Integer>();
		que2 = new LinkedList<Integer>();
	}
	
	public void push(int n)
	{
		if(que1.size()== 0)
		{
			que1.add(n);
		}
		else
		{
			int l = que1.size();
			
			for (int i = 0; i < l; i++) 
			{
				que2.add(que1.remove());
			}
			que1.add(n);
			for (int i = 0; i < l; i++) 
			{
				que1.add(que2.remove());
			}
		}
	}
	
	public void pop()
	{
		if(que1.isEmpty())
		{
			System.out.println("Empty");
		}
		else
		{
			System.out.println("Element : " + que1.remove());
		}
	}

}
