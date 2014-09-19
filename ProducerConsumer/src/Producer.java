import java.util.ArrayList;


public class Producer implements Runnable{

	private ArrayList<Integer>  sharedVector;
	private int size;
	
	Producer(ArrayList<Integer>  sharedVector, int size)
	{
		this.sharedVector = sharedVector;
		this.size = size;
	}
	public void run()
	{
		for (int i = 0; i < 7; i++) 
		{
			System.out.println("Produced : " +i);
			produce(i);
		}
	}
	
	public void produce(int num)
	{
		while(sharedVector.size()==size)
		{
			try {
				synchronized (sharedVector) {
					System.out.println("Queue is full : " +Thread.currentThread().getName() + "size : " + sharedVector.size() );
					sharedVector.wait();
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		synchronized (sharedVector) {
			sharedVector.add(num);
			sharedVector.notifyAll();
		}
		
		
		
		
	}
}
