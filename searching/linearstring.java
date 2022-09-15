package searching;

import java.util.Scanner;

public class linearstring {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE COUNT");
		int n=sc.nextInt();
		String a[]=new String[n];
		System.out.println("ENTER THE STRINGS:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLine();
			
		}
		
		System.out.println("ENTER THE STRING TO BE SEARCHED:");
		String s=sc.nextLine();
		
		int i, f=0;
		for(i=0;i<n;i++)
		{
			if(s.equals(a[i]))
			{
				f++;
				break;
			}
		}
		if(f>0)
			System.out.println("string find at "+ i);
		else
			System.out.println(	"STRING NOT FOUND "	);

	}

}
