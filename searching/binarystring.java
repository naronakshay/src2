package searching;

import java.util.Scanner;

public class binarystring {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE COUNT");
		int n=sc.nextInt();
		String a[]=new String[n];
		System.out.println("ENTER THE STRINGS in sorted order:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
			
		}
		
		System.out.println("ENTER THE STRING TO BE SEARCHED:");
		String s=sc.next();
		
		int l=0,h=n-1,flag=0;
		int mid=(l+h)/2;
		while(l<=h)
		{
			if(a[mid].equals(s))
			{
				System.out.println("FOUND AT "+(mid+1));
				flag++;
				break;
			}
			else if(a[mid].compareTo(s)<0)
				l=mid+1;
			else
				h=mid-1;
			mid=(l+h)/2;
		}
		
		if(flag>0)
			System.out.println("ITEM FOUND");
	}

}
