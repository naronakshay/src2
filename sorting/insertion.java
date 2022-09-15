package sorting;

import java.util.Scanner;

public class insertion {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE COUNT");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("ENTER THE ELEMENTS:");
		for(int i=0;i<n;i++)
		
			a[i]=sc.nextInt();
			
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
		
		for(int i=1;i<n;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0 &&a[j]>key )
			{
							a[j+1]=a[j];
							j=j-1;
			
			}	
			a[j+1]=key;
		}
		
		
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
		
}}