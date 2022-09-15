package searching;

import java.util.Scanner;

public class linearsearch {

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
		
		int i, f=0;
		for(i=0;i<n;i++)
		{
			if(s==a[i])
			{
				f++;
				break;
			}
		}
		if(f>0)
			System.out.println("element find at "+i);
	}

}
