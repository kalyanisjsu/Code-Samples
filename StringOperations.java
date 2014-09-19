import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class StringOperations {

	String s = "abcdab";

	String in  = "Hello world";
	
	public void permutation()
	{
		
	}
	
	
	public void nonRepeated()
	{
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) 
		{
			if(hm.containsKey(s.charAt(i)))
			{
				int val = hm.get(s.charAt(i));
				val++;
				hm.put(s.charAt(i), val);
			}
			else
				hm.put(s.charAt(i), 1);
		}
		
		Set<Character> keySet = hm.keySet();
		for (char c : keySet)
		{
			if(hm.get(c) == 1)
			{
				System.out.println(c);
				break;
			}
		}
	}
	
	public void palindrome()
	{
		boolean flag = false;
		int j = s.length()-1;
		for(int i = 0 ; i < s.length()/2; i++, j--)
		{
			if(s.charAt(i) == s.charAt(j))
			{
				flag = true;
			}
			else
			{
				flag = false;
			}
		}
		if(flag)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not");
	}

	public void removeChar(char c)
	{
		String s1 = s.replaceAll(Character.toString(c), "");
		System.out.println(s1);
	}

	
	
	

}
