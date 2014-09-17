
public class SinglyLL_Github {
	
	
	LinkNode head;
	
	public SinglyLL_Github() 
	{
		head = null;
	}
	
	public void insertAtStart(int n)
	{
		LinkNode node = new LinkNode();
		
		if(head == null)
		{
			head = new LinkNode(n);
		}
		else
		{
			node.setData(n);
			node.setNext(head);
			head = node;
		}
	}
	
	public void insertAfterNodek(int k, int n)
	{
		LinkNode curr = new LinkNode();
		LinkNode node = new LinkNode();
		
		if(head == null)
		{
			head = new LinkNode(n);
		}
		else
		{
			int l = 0;
			curr = head;
			while(curr.getNext() != null && l!=k)
			{
				curr = curr.getNext();
				l++;
			}
			node.setData(n);
			node.setNext(curr.getNext());
			curr.setNext(node);
		}
	}
	
	public void insertAtEnd(int n)
	{
		LinkNode curr = new LinkNode();
		LinkNode node = new LinkNode();
		
		if(head == null)
		{
			head = new LinkNode(n);
		}
		else
		{
			curr = head;
			node.setData(n);
			while(curr.getNext()!=null)
			{
				curr = curr.getNext();
			}
			curr.setNext(node);
		}
	}
	
	public void delete(int n)
	{
		LinkNode curr = new LinkNode();
		if(head == null)
		{
			System.out.println("Empty LL");
		}
		else if(head.getData() == n)
		{
			head = head.getNext();
		}
			
		else
		{
			curr = head;
			while(curr != null)	
			{
				if(curr.getNext().getData() == n)
				{
					curr.setNext(curr.getNext().getNext());
					break;
				}
				else
				{
					curr = curr.getNext();
				}	
			}
		}
	}
	
	public void getkthNode(int k)
	{
		LinkNode curr = new LinkNode();
		
		if(head == null)
		{
			System.out.println("Empty");
		}
		else
		{	
			int l = 0;
			curr = head;
			while(curr != null)
			{
				if(l == k)
				{
					System.out.println("data : " + curr.getData());
					break;
				}
				else
				{
					curr = curr.getNext();
					l++;
				}
			}
		}
		
	}
	
	
	public void printCenterNode()
	{
		LinkNode fast = new LinkNode();
	    LinkNode slow = new LinkNode();
		
		if(head == null)
		{
			System.out.println("Empty");
		}
		else
		{
			fast = head;
			slow = head;
			while(fast != null && fast.getNext()!= null)
			{
				fast = fast.getNext().getNext();
				slow = slow.getNext();
			}
		}
		System.out.println("center : " + slow.getData());
	}
	
	
	public void printNthNodefromEnd(int n)
	{
		LinkNode p1 = new LinkNode();
		LinkNode p2 = new LinkNode();
		int c = 0;
		p1 = head;
		p2 = head;
		
		while(c < n)
		{
			p2 = p2.getNext();
			c++;
		}
		
		while(p2!=null)
		{
			p2 = p2.getNext();
			p1 = p1.getNext();
		}
		System.out.println("data : " + p1.getData());
	}
	
	public void printCount(int n)
	{
		LinkNode curr;
		int c = 0;
		curr = head;
		if(head == null)
		{
			System.out.println("empty");
		}
		
		while(curr != null)
		{
			if(curr.getData() == n)
			{
				c++;
			}
			curr = curr.getNext();
		}
		
		System.out.println("Data : " + c);
	}
	
	public void reverse()
	{
		LinkNode curr = null;
		LinkNode next = null;
		LinkNode prev = null;
		
		if(head == null)
		{
			System.out.println("Empty");
		}
		else
		{
			curr = head;
			while(curr != null)
			{
				next = curr.getNext();
				curr.setNext(prev);
				prev = curr;
				curr = next;
			}
			head = prev;
		}
	}
	
	public void print()
	{
		print(head);
	}
	
	public void print(LinkNode n)
	{
		while(n!= null)
		{
			System.out.println(n.getData());
			n = n.getNext();
		}
	}
	
	
	

}
