import java.util.HashMap;
import java.util.Hashtable;
import java.util.Stack;


public class SinglyLL_Github {
	
	
	LinkNode head;
	
	public SinglyLL_Github() 
	{
		head = null;
	}
	
	// Insert at start
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
			//head.getNext().setNext(head); // use this condition to create loop
		}
	}
	
	// Insert node after kth position
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
	
	
	//insert at end
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
	
	//Delete node	
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
	
	// Print kth Node	
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
	
	// Print center node	
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
	
	//Print nth node from end	
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
	
	// Count the specific value in LL	
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
	
	// reverse LL
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
	
	
	//Detect loop in LL using hashmap
	public void detectLoop()
	{
		System.out.println("detect");
		LinkNode curr = new LinkNode();
		HashMap<LinkNode, Integer> hm = new HashMap<LinkNode, Integer>();
		if(head == null)
		{
			System.out.println("Empty list");
		}
		else
		{
			curr = head;
			while(curr!=null)
			{
				if(hm.containsKey(curr))
				{
					System.out.println("LOOP");
					break;
				}
				else
				{
					hm.put(curr, 1);
					curr = curr.getNext();
				}
				
			}
			
		}
	}
	
	// detect loop using pointers
	public void detectUsingPointers()
	{
		LinkNode slow = head;
		LinkNode fast = head;
		while(slow!=null && fast!=null && fast.getNext() != null)
		{
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			if(slow.equals(fast))
			{
				System.out.println("LOOP");
				break;
			}
					
		}
	}
	
	//check for palindrome using stack
	public void palindrome()
	{
		Stack<LinkNode> st = new Stack<LinkNode>();
		LinkNode curr = new LinkNode();
		boolean flag = false;
		curr = head;
		while(curr != null)
		{
			st.push(curr);
			curr = curr.getNext();
		}
		
		curr = head;
		while(!st.isEmpty())
		{
			LinkNode node = st.pop();
			System.out.println("stack : " + node.getData());
			System.out.println("curr : " + curr.getData());
			if(curr.getData() == node.getData())
			{
				flag = true;
			}
			else
			{
				flag = false;
				break;
			}
			curr = curr.getNext();
					
		}
		
		if(flag == true)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		
	}
	
	
	//palindrome by reversing
	public void palindrome_reverse()
	{
		
	}
	
	//insert in sorted LL
	public void insertInSorted(int n)
	{
		LinkNode curr = new LinkNode();		
		LinkNode node = new LinkNode();
		node.setData(n);
		if(head == null)
		{
			head = new LinkNode(n);
		}
		else if(head.getData() > n)
		{
			node.setNext(head);
			head = node;
		}
		
		else
		{
			curr = head;
			while(curr.getNext() != null && curr.getNext().getData() < n)
			{
				curr = curr.getNext();
			}
			node.setNext(curr.getNext());
			curr.setNext(node);
		}
	}
	
	//print reverse recursively -- > not working
	public void reverseRecursive()
	{
		System.out.println("Recursive reverse");
		reverseRecursive(head);
	}
	
	public void reverseRecursive(LinkNode node)
	{
		if(node == null)
		{
			System.out.println("Empty");
		}		
		reverseRecursive(node.getNext());
		System.out.println(node.getData());
	}
	
	//remove duplicates from sorted list
	public void removeDuplicatesSorted()
	{
		LinkNode curr = new LinkNode();
		
		if(head == null)
		{
			System.out.println("Empty");
		}
		else
		{
			curr = head;
			while(curr.getNext() != null)
			{
				if(curr.getData() == curr.getNext().getData())
				{
					curr.setNext(curr.getNext().getNext());
				}
				else
				{
					curr = curr.getNext();
				}
				
			}
		}
	}
	
	public void removeDuplicatesUnsorted()
	{
		LinkNode curr = new LinkNode();
	    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	    
		if(head == null)
		{
			System.out.println("Empty");
			
		}
		else
		{
			curr = head;	
			while(curr != null)
			{
				if(hm.containsKey(curr.getData()))
				{
					System.out.println("duplicate : " + curr.getData());
				}
				else
				{
					hm.put(curr.getData(), 1);
					System.out.println("non duplicate : " + curr.getData());
					curr = curr.getNext();
				}
			}
		}
	}
	
	// print LL	
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
