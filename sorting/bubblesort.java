package sorting;
import java.util.*;

public class bubblesort {
	
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
		
		int temp;
		for (int k=0;k<n;k++)
		{
			for(int j=0;j<n-k-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
		
	}
	
	
	
	
	

}
