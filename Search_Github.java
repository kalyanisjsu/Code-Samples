
public class Search_Github {

	int[] a = {1,3,5,6,8,9,20};
	boolean found = false;
	
	public boolean linearSearch(int n)
	{
		for (int i = 0; i < a.length; i++) 
		{
			if(n == a[i])
			{
				found = true;
				return found;
			}
		}
		return found;
	}
	
	public void binarySearch(int n)
	{
		boolean f = search(0, a.length-1, n);
		if(f)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("not found");
		}
	}
	
	public boolean search(int low, int high, int key)
	{
		if(low <= high)
		{
			int mid = (low+high)/2;
			if(key == a[mid])
			{
				found = true;
				return found;
			}			
			else 
			{ 
				if(key < a[mid])
				{
					search(0, mid, key);
				}
				else
				{
					search(mid+1, high, key);
				}	
			}
		}
		return found;
	}
}
