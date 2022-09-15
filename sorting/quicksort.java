package sorting;

import java.util.Scanner;

public class quicksort {

	static void swap(int a [], int i, int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
		
	static int partition(int a[],int low, int high)
	{
		int pivot=a[high];
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(a[j]<=pivot)
			{
				i++;
				swap(a,i,j);
				
			}
		}
		swap(a,i+1,high);
		return i+1;
		
	}
	
	static void quickSort (int a[] , int l, int h)
	{
		if(l<h)
		{
			int pi=partition(a,l,h);
			quickSort(a,l,pi-1);
			quickSort(a,pi+1,h);
			
		}
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE COUNT");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("ENTER THE ELEMENTS:");
		for(int i=0;i<n;i++)
		
			a[i]=sc.nextInt();
			
		for(int i=0;i<n;i++)
			System.out.print(a[i]);
		quickSort(a,0,n-1);
		
		for(int i=0;i<n;i++)
			System.out.print(a[i]);
		
		
		
		

	}

}
