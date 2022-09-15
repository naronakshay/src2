package sorting;

import java.util.Scanner;

public class selection {
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE COUNT");
		int n=sc.nextInt();
		int a[]=new int[20];
		System.out.println("ENTER THE ELEMENTS:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		
		for(int k=0;k<n;k++)
		{
			
			for(int j=k+1;j<n;j++)
			{
				if(a[j]<a[k])
				{
					int temp=a[k];
					a[k]=a[j];
					a[j]=temp;
				}
			}
		
		}
		
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
		
	
	}
}
