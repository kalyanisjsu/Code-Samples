import java.util.HashMap;
import java.util.Map;


public class Array {
	
	int[] a = {-8, 1, 4, 6, 10, 45};
	int s = 57;
	
	Map <Integer, Integer> hm = new HashMap<>();
	
	
	// Method 1 : Write a C program that, given an array A[] of n numbers and another number x, determines whether or not there exist two elements in S whose sum is exactly x.
	public void sumHash()
	{
		int t;
		
		hm.put(a[0], s - a[0]);
		
		for (int i = 0; i < a.length; i++) 
		{
			t = s - a[i];
			
			if(hm.containsKey(a[i]))
			{
				System.out.println("if 1");
				
				if(hm.get(a[i]).equals(t))
				{
					System.out.println("Key : " + a[i] + "    Value :   "  + t) ;
				}
			}
			hm.put(a[i], t);
		}
	}
	
	// Method 2 : Write a C program that, given an array A[] of n numbers and another number x, determines whether or not there exist two elements in S whose sum is exactly x.
	public void sumSort()
	{
		int i = 0;
		int j = a.length-1;
		
		while(i < j)
		{
			if(a[i] + a[j] > s)
			{
				j--;
			} 
			else if(a[i] + a[j] < s)
			{
				i++;
			}
			if(a[i] + a[j] == s)
			{
				System.out.println(a[i] + "    " + a[j]);
				break;
			}
		}
	}
	
	//Write a function which takes an array and emits the majority element (if it exists), otherwise prints NONE as follows:
	public void printMaj()
	{
		int[] a1 = {2, 2, 2, 2, 5, 2, 2, 6};
		int cand = findCand(a1);
		checkMaj(a1, cand);
	}
	
	public int findCand(int[] a2)
	{
		int maj_ind = 0 , count  = 1;
		for (int i = 0; i < a2.length; i++)
		{
			if(a2[maj_ind] == a2[i])
			{
				count++;
				
			}
			else
			{
				count--;
			}
			if(count == 0)
			{
				maj_ind = i;
				count = 1;
			}
		}
		return a2[maj_ind];
	}
	
	
	public void checkMaj(int[] a3, int cand)
	{
		int cnt  = 0;
		for (int i = 0; i < a3.length; i++) 
		{
			if(a3[i] == cand)
			{
				cnt++;
			}
		}
		if(cnt > a3.length/2)
		{
			System.out.println("Found  : " + cnt);
		}
		else
		{
			System.out.println("Null");
		}
	}
	

}
