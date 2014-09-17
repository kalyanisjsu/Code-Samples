
public class LinkNode {
	
	LinkNode next, prev;
	int data;
	
	public LinkNode() {
		
		prev = null;
		next = null;
		data = 0;
	} 
	
	public LinkNode(int d)
	{
		prev = null;
		next = null;
		data = d;		
	}

	public void setPrev(LinkNode prev)
	{
		this.prev = prev;
	}
	
	public LinkNode getPrev()
	{
		return prev;
	}
	
	public LinkNode getNext() {
		return next;
	}

	public void setNext(LinkNode next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	

}
