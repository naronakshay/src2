package threads;

import java.util.Scanner;

public class rev extends Thread{

	public void run() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER THE LIMIT FOR REVERSE:");
			int n=sc.nextInt();
			System.out.println("\n==================================");
			System.out.println("Reverse series :");
			System.out.println("\n==================================");
			for(int i=n;i>=1;i--)
			{
				System.out.println(i+" ");
			}
			System.out.println("\n==================================");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
