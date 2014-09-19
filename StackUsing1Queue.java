import java.util.LinkedList;
import java.util.Queue;


public class StackUsing1Queue {
	
	Queue<Integer> que;
	
	public StackUsing1Queue() 
	{
		que = new LinkedList<Integer>();
	}
	
	public void push(int n)
	{
		if(que.isEmpty())
		{
			que.add(n);
		}
		else
		{
			int len = que.size();
			que.add(n);
			while(len>0)
			{
				int val = que.remove();
				que.add(val);
				len--;
			}
		}
	}

	public void pop()
	{
		if(que.isEmpty())
		{
			System.out.println("Empty queue");
		}
		else
		{
			System.out.println("Elemnt : " + que.remove());
		}
	}

}
