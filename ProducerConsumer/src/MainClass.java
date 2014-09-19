import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) 
	{
		int size = 4;
		ArrayList<Integer> sharedQueue = new ArrayList<Integer>();
		
		Thread producer = new Thread(new Producer(sharedQueue, size), "Producer");
		Thread consumer = new Thread(new Consumer(sharedQueue, size), "Consumer");
		
		producer.start();
		consumer.start();
		
	}

}