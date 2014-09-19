
public class HeapSort {
	
	int count;
	
	public void heapSort()
	{
		int[] a = {90,67,87,101};
		count = a.length-1;
		heapify(a);
		
		for(int i = count ; i >= 0; i--)
		{
			swap(a, i, 0);
			count--;
			maxheapify(a, 0);
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		
	}
	
	public void heapify(int[] a)
	{
		for(int i = count/2; i>=0; i--)
		{
			maxheapify(a,i);
		}
	}
	
	public void maxheapify(int[] a, int i)
	{
		int left = 2*i;
		int right = 2*i+1;
		int max = i;
		if(left<=count && a[left] > a[i])
		{
			max = left;
		}
		
		if(right <= count && a[right] > a[max])
		{
			max = right;
		}
		
		if(max != i)
		{
			swap(a, i , max);
			maxheapify(a, max);
		}
	}
	
	public void swap(int[] a , int i, int max)
	{
		int temp = a[i];
		a[i] = a[max];
		a[max] = temp;
	}

}
