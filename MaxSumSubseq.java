
public class MaxSumSubseq {
	
	int max_end, max_for_now;
	int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
	
	public MaxSumSubseq() 
	{
		max_end = 0;
		max_for_now = 0;
	}
	
	public int findSeq()
	{
		for (int i = 0; i < a.length; i++) 
		{
			max_end = max_end + a[i];
			if(max_end < 0)
			{
				max_end = 0;
			}
			if(max_for_now < max_end)
			{
				max_for_now = max_end;
			}
			
		}
		
		return max_for_now;
	}
	

}
