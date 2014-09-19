
public class Sorting_Github {
	
	int[] input;
	int[] part;
	int[] arr;
	public void bubbleSort(int[] a)
	{
		System.out.println("Bubble sort --> ");
		for (int i = 1; i < a.length; i++) 
		{
			for (int j = 0; j < a.length-i; j++)
			{
				if(a[j] > a[j+1])
				{
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		print(a);
	}
	
	public void insertion(int[] a)
	{
		System.out.println("Insertion -->");
		int key, j;
		for (int i = 1; i < a.length; i++)
		{
			key = a[i];
			for (j = i-1; j >= 0 && a[j] > key; j--) 
			{
				a[j+1] = a[j];
			}
			a[j+1] = key;
		}
		print(a);
	}
	
	public void selection(int[] a)
	{
		System.out.println("Selection sort --> ");
		int m;
		for (int i = 0; i < a.length; i++)
		{
			m = i;
			for (int j = i+1; j < a.length-1; j++) 
			{
				if(a[j] < a[m])
				{
					m = j;
				}
			}
			a[i] = a[m];
		}
		print(a);
	}
	
	public void mergeSort(int a[])
	{
		System.out.println("Merge sort --> ");
		input = a;
		part = new int[a.length];
		partition(0, a.length-1);
		print(input);
	}
	
public void partition(int low, int high)
{
	if(low<high)
	{
		int mid = (low + high)/2;
		partition(low, mid); 
		partition(mid+1, high);
		merge(low, mid, high);
	}
}

public void merge(int l, int m, int h)
{
	int i1 = l;
	int i2 = m+1;
	int k = l;
	for(int i = l; i <= h; i++)
	{
		part[i] = input[i];
	}
	
	while(i1 <= m && i2 <= h)
	{
		if(part[i1] <= part[i2])
		{
			input[k] = part[i1];
			i1++;
		}
		else
		{
			input[k] = part[i2];
			i2++;
		}
		k++;
	}

	while(i1 <= m)
	{
		input[k] = part[i1];
		k++;
		i1++;
	}
}

public void quickSort(int[] a)
{
	System.out.println("Quick sort -->");
	arr = a;
	pivot(0, arr.length-1);
	print(arr);
}

public void pivot(int low, int high)
{
	int i = low;
	int mid = (low+high)/2;
	int j = mid+1;
	int pivot = arr[mid];
	
	while(i<=j)
	{
		while(arr[i] < pivot)
		{
			i++;
		}
		while(arr[j] > pivot)
		{
			j--;
		}
		if(i<=j)
		{
			swap(i,j);
			i++;
			j--;
		}
		if(low < j)
		{
			pivot(low,j);
		}
		if(i < high)
		{
			pivot(i,high);
		}
	}
}

public void swap(int m, int n)
{
	int temp = arr[m];
	arr[m] = arr[n];
	arr[n] = temp;
}
	
	
	public void print(int[] a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}
	

}
