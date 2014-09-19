import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class CareerCup
{
	int matrix[][];
	int a = 3;
	int b = 3;
	int res = 1;
	int p[] = {1,2,3};
	
	
	public void removeDuplicate()
	{
		String s  = "abracadabra";
		char[] c  = s.toCharArray();
		HashSet<Character> h = new HashSet<Character>();
		for (int i = 0; i < c.length; i++) 
		{
			h.add(c[i]);
		}
		
		System.out.println("Non Duplicates  : " + h.toString());
	}
	
	public void StringtoInt()
	{
		String s = "123";
		char[] c = s.toCharArray();
		int res = 0;
		for (int i = 0; i < c.length; i++) 
		{
			res = res*10+c[i]-'0';
		}
		System.out.println(res);
	}
	
	
	public void random()
	{
		Random num  = new Random();
		for (int i = 1; i < 5; i++) 
		{
			System.out.println(num.nextInt(5));
		}
	}
	
	public void regex()
	{
		String s = "This is my small example string which I'm going to use for pattern matching";
		System.out.println(s.matches("\\w.*"));
		String str[] = s.split("\\s+");
		for (int i = 0; i < str.length; i++) 
		{
			System.out.println(str[i]);
		}
		System.out.println(s.replaceAll("\\s", "\t"));
	}
	
	public void powerSet()
	{
		int[] a = {2,5,6};
		int size = a.length;
		int powerSize = (int) Math.pow(2, size);
		ArrayList resultant = new ArrayList();
		
		for(int  i = 0 ; i < powerSize; i++)
		{
			String binary = convertToBinary(i,size);
			ArrayList part = new ArrayList();
			
			for (int j = 0; j < binary.length(); j++) 
			{
				if(binary.charAt(j) == '1')
				{
					part.add(a[j]);
				}
			}
			resultant.add(part);
		}
		
		for (int i = 0; i < resultant.size(); i++) 
		{
			System.out.println(resultant.get(i));
		}
	}
	
	
	public String convertToBinary(int i, int size)
	{
		String temp = Integer.toBinaryString(i);
		String res = temp;
		int len = temp.length();
		for (int j = len; j < size; j++) 
		{
			res = "0" + res;
		}
		
		return res;
	}
	
	public void atoi()
	{
		String str  = "123";
		char[] arr = str.toCharArray();
		int sign = 1;
		int i = 0;
		int res = 0;
		
		for(i = 0; i < arr.length; ++i)
		{
			res = res*10 + arr[i] - '0';
		}
		System.out.println("res:" + res);
	}
	
	
	public void reverseString()
	{
		String s1 = "Madam, I'm Adam";
		char[] a = s1.toCharArray();
		int last = s1.length()-1;
		for(int i = 0; i < s1.length()/2 ; i++)
		{
			char temp = a[i];
			a[i] = a[last];
			a[last] = temp;
			last--;
		}
		System.out.println(String.valueOf(a));
	}
	
	public void printMatrix()
	{
		for (int i = 1; i < 4; i++) 
		{
			for (int j = 1; j < 10; j++) 
			{
				System.out.println(j*i);
			}
			System.out.println('\n');
		}
	}
	
	public void printOdd()
	{
		for (int i = 1; i < 100; i = i+2) 
		{
			System.out.println(i);
		}
	}
	
	public void printEven()
	{
		for (int i = 0; i < 100; i = i+2) 
		{
			System.out.println(i);
		}
	}
	
	public void printMax()
	{
		int[] a = {-1,-3,-6,-8};
		int max = Integer.MIN_VALUE;
		System.out.println("max : " + max);
		for (int i = 0; i < a.length; i++) 
		{
			if(max < a[i])
			{
				max  = a[i];
			}
		}
		System.out.println(max);
	}
	
	public void hex()
	{
		int k = 34;
		System.out.println(Integer.toHexString(k));
	}
	
	public int fib(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
		}
		
		else
			return fib(n-1) + fib(n-2);
	}
	
	public int fact(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}
	
	public void reverseMatrix()
	{
		char[][] matrix= {{'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'}};
		
		StringBuilder sb  = new StringBuilder();
		
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				sb.append(matrix[j][i]);
			}
			
		}
		System.out.println("Matrix :" + sb);
		
		
	}
	
	public void printSpell()
	{
		char [][] maze = {{'a','b','c','d','e'},
	                      {'f','g','h','i','j'},
	                      {'k','l','m','n','o'},
	                      {'p','q','r','s','t'},
	                      {'u','v','w','x','y'},
	                      {'z',' ',' ',' ',' '}};
		String s = "con";
		int currX = 0, currY = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int charValue = s.charAt(i)-'a';
			System.out.println(charValue);
			int destX = charValue % 5; // no need to -1 since charValue already starts from 0
			int destY = charValue / 5;
			
			for (int j = 0; j <= Math.abs(currY-destY); j++) {
				if (currY-destY < 0)  // if currY is row 1, and destY is row 3
					System.out.println("Down");
				else
					System.out.println("Up");
			}
			for (int j = 0; j <= Math.abs(currX-destX); j++) {
				if (currX-destX < 0)  // if currX is col 1, and destX is col 3
					System.out.println( "Right");
				else
					System.out.println( "Left");
			}
			System.out.println( "OK");
			currX = destX;
			currY = destY;
		}
		
		
	}
	
	
	public void count4()
	{
		int n = 200;
		int cnt = 0;
		for (int i = 0; i < n; i++) 
		{
			if(!check4(i))
			{
				cnt++;
			}
		}
		System.out.println("Count : " + cnt);
	}
	
	public boolean check4(int num)
	{
		if(String.valueOf(num).contains("4"))
		{
			return true;
		}
		else
			return false;
	}
	
	
	
	public void kthElement()
	{
		int[] a = {1,2,4,6,8};
		int[] b = {4,8,10,12};
		int i = 0;
		int j = 0;
		int k = 1;
		int min = -1;
		while(k > 0)
		{
			while(a[i] <= min)
			{
				i++;
			}
			while(b[j] <= min)
			{
				j++;
			}
			if(a[i] < b[j])
			{
				min = a[i];
				i++;
			}
			else 
			{
				min = b[j];
				j++;
			}
			k--;
		}
		System.out.println(a[min] + " " + b[min]);
		
	}
	
	
	public void anagram()
	{
		String a = "xzy"; 
		String b = "afdgzyxksldfm";
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
		String s1 = String.valueOf(a1);
		System.out.println(s1);
		String s2 = String.valueOf(b1);
		System.out.println(s2);		
		if(s2.contains(s1))
		{
			System.out.println("true");
		}
	}
	
	public void dictionary()
	{
		String in = "iiifrssst";
		//String in = "eiifrsst";
		char[] c = in.toCharArray();
		ArrayList<String> dict  = new ArrayList<String>();
		dict.add("hello");
		dict.add("world");
		dict.add("is");
		dict.add("my");
		dict.add("first");
		dict.add("program");
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		Set s = null;
		for (int i = 0; i < in.length(); i++) 
		{
			map.put(in.charAt(i), 0);
		}
		s = map.keySet();
		System.out.println(s);
		
		boolean flag = false;
		for (int i = 0; i < dict.size(); i++)
		{
			int cnt = 0;
			System.out.println(dict.get(i));
			char[] ch = dict.get(i).toCharArray();
			for (int j = 0; j < ch.length; j++) 
			{
				if(s.contains(ch[j]))
				{
					cnt++;	
					System.out.println(cnt);
				}
			}
			if(cnt == ch.length)
			{
				flag = true;
			}	
			
		}
		if(flag)
		{
			System.out.println("Present !!!");
		}
		else
			System.out.println("Not");
	}
	
	public void iterator()
	{
		ArrayList<ArrayList> result = new ArrayList<ArrayList>();
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		result.add(a1);
		//a.clear();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(3);
		a2.add(4);
		a2.add(5);
		result.add(a2);
		//a.clear();
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(6);
		result.add(a3);
		
		for (int i = 0; i < result.size(); i++) 
		{
			for(int j = 0;j < result.get(i).size(); j++)
			{
				System.out.println(result.get(i).get(j));
			}
		}
	}
	
	public void sum1()
	{
		int [] a= {1,2,3,5,6,8};
		int [] b= {1,2,7,8,9};
		int ia = 0;
		int ib = b.length-1;
		int t = 11;
		int s = a[ia] + b[ib];
		while(ia < a.length && ib > 0)
		{
			s = a[ia] + b[ib];
			if(s == t)
			{
				System.out.println(a[ia] + " " + b[ib]);
				break;
			}
			else if(s > t)
			{
				ib--;
			}
			else
				ia++;
		}
	}
	
	public void maxSubseq()
	{
		int[] a = {5,2,6,3,4,1,9,9,8,9,5};
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		for(int i = 0; i < a.length-1 ; i++)
		{
			if(a[i] - a[i+1] <= 1)
			{
				System.out.println(a[i] + "    "  + a[i+1]);
				res.add(a[i]);
				res.add(a[i+1]);
			}
		}
		
		for (int i = 0; i < res.size(); i++) 
		{
			System.out.println("Res : " + res.get(i));
		}
		
	}
	
	
	public void power()
	{
		while(b>0)
		{
			res  = res*a;
			b--;
		}
		System.out.println("Power  : " + res);
	}
	
	
	public void sort()
	{
		int[] a = {13,14,10,11,12};
		for (int i = 1; i < a.length; i++) 
		{
			for (int j = 0; j < a.length-i; j++) 
			{
				if(a[j] > a[j+1])
				{
					int t = a[j+1];
					a[j+1] = a[j];
					a[j] = t;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		for (int i = 0; i < a.length-1; i=i+2) 
		{
			int t = a[i];
			a[i] = a[i+1];
			a[i+1] = t;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("res : " + a[i]);
		}
		
	}
	
	public void minSeq()
	{
		int res = 0;
		int s = 8;
		int a[] = {2,1,1,4,3,6};
		int ind = 0;
		Set<Integer> s1 =  new HashSet<Integer>();
		
		for (int i = 0; i < a.length; i++) 
		{
			if(res <= 8)
			{
				res = res + a[i];
				ind++;
			}
		}
		
		for (int i = ind-1; i < a.length; i++) 
		{
			s1.add(a[i]);
		}
		System.out.println("Result : " + s1);
	}
	
	public void adjMatrix()
	{
		int[][] matrix = new int[4][4];
		for (int i = 0; i < 4; i++) 
		{
			for (int j = 0; j < 4; j++)
			{
				matrix[i][j] = 0;
			}
		}
		matrix[0][1] = 1;
		matrix[1][0] = 1;
		matrix[2][1] = 1;
		matrix[1][2] = 1;
		matrix[0][2] = 1;
		matrix[2][0] = 1;
		matrix[4][1] = 1;
		matrix[1][4] = 1;
		
		for (int i = 0; i < 4; ) 
		{
			for (int j = 0; j < 4; j++) 
			{
				if(matrix[i][j] == 1)
				{
					i = j;
				}
			}
			
		}
		
		
	}
	
	
	
	
	public void sequence()
	{
		matrix = new int[3][3];
		matrix[0][0] = 1;
		matrix[0][1] = 5;
		matrix[0][2] = 9;
		matrix[1][0] = 2;
		matrix[1][1] = 3;
		matrix[1][2] = 8;
		matrix[2][0] = 4;
		matrix[2][1] = 6;
		matrix[2][2] = 7;
		
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 1; j < 3; j++) 
			{
				System.out.println(matrix[i][j-1] +   " " + matrix[i][j] );
				if(matrix[i][j-1] - matrix[i][j] == 1)
				{
					System.out.println("Matrix : " + matrix[i][j-1]  +  matrix[i][j]);
				}
			}
		}
	}
	
	public void sum()
	{
		int a[] = {1,2,3,4,5,6,7};
		int a1 = 0;
		int b = 0;
		int c = 0;
		int d = 7;
		int res = 0;
		
		for (a1 = 0; a1 < a.length-3; a1++) 
		{
			b = a1+1;
			c = a.length-1;
			while(b<c)
			{
				if(a[a1] + a[b] + a[c] <= d)
				{
					System.out.println(a[a1]+ " " + a[b] + " "+ a[c]);
					b++;
					c--;
				}
				else
					c--;
			}
		}
		
	}

	public void multispace()
	{
		String s = "   Hello   World   ";
		char[] a = s.toCharArray();
		int l = 0;
		int init = 0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i] == ' ')
			{
				l++;
			}
			else
			{
				a[init] = a[i];
				init++;
			}
			
			
		}
		String s1 = new String(a);
		System.out.println(s1);
		
	}
	
	
	
	
}
