import java.util.Stack;


public class QueueUsingStack {
	
	Stack stack1, stack2;
	
	public QueueUsingStack() 
	{
		stack1 = new Stack();
		stack2 = new Stack();
	}
	
	
	public void insert(Integer n)
	{
		if(stack1.isEmpty())
		{
			stack1.push(n);
		}
		else
		{
			int len = stack1.size();
			for (int i = 0; i < len; i++) 
			{
				stack2.push(stack1.pop());
			}
			stack1.push(n);
			for (int i = 0; i < len; i++) 
			{
				stack1.push(stack2.pop());
			}
		}
	}
	
	public void remove()
	{
		if(stack1.isEmpty())
			System.out.println("Empty");
		else
			System.out.println("Element : " + stack1.pop());
	}

}
