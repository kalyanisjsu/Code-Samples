import java.util.ArrayList;


public class Consumer implements Runnable{

	private ArrayList<Integer>  sharedVector;
	private int size;
	
	Consumer(ArrayList<Integer>  sharedVector, int size)
	{
		this.sharedVector = sharedVector;
		this.size = size;
	}
	public void run() 
	{
		while(true)
		{
			try {
				System.out.println("Consumed : " + consume());
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public int consume()
	{
		while(sharedVector.isEmpty())
		{
			synchronized (sharedVector) {
				try {
					System.out.println("Queue is empty : " +Thread.currentThread().getName() + "size : " + sharedVector.size() );
					sharedVector.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		synchronized (sharedVector) {
			sharedVector.notifyAll();
			return sharedVector.remove(0);
		}
		
		
	}

}
