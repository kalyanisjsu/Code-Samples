
public class StringPermutation {
	
	public void permutation(String str) { 
	    permutation("", str); 
	}

	public void permutation(String prefix, String str) 
	{
	    int n = str.length();
	    if (n == 0) 
	    {
	    	System.out.println(prefix);
	    }
	    else 
	    {
	        for (int i = 0; i < n; i++)
	        {
	        	 System.out.println("prefix : " + prefix + str.charAt(i) + "     str : "  +  str.substring(0, i) + str.substring(i+1, n));
	        	 permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	        }
	           
	    }
	}
}
