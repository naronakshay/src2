package searching;

import java.util.Scanner;

class Binary{
	int bsearch(int a[],int x,int l,int h)
	{
		if(h>=l)
		{
			int mid =(l+h)/2;
			if(a[mid]==x)
				return mid;
			if(a[mid]>x)
				return bsearch(a,x,l,mid-1);
			else
				return bsearch(a,x,mid+1,h);
		
		
	}
		return -1;
}

public class binarysearch {
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE COUNT");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("ENTER THE ELEMENTS:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		System.out.println("ENTER THE ELEMENT TO BE SEARCHED:");
		int s=sc.nextInt();
		
		Binary b=new Binary();
		int r=b.bsearch(a,s,0,n-1);
		
		if(r==-1)
			System.out.println("not found ");
		else
			System.out.println("elemet found "+r);
			
		
		

	}

}}
