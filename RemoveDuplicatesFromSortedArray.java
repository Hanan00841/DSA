package infor;
import java.util.*;
public class RemoveDuplicatesFromSortedArray {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of array elements:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the sorted array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int i=0,unique;
		if(n==0)
		{
			unique=0;
		}
		else
		{
			unique=1;
		}
		for(int j=1;j<n;j++)
		{
			if(arr[i]==arr[j])
				continue;
			else
			{
				arr[i+1]=arr[j];
				i++;
				unique++;
			}
		}
		System.out.println("The sorted array elements without duplicates are:");
		for(int k=0;k<unique;k++)
		{
			System.out.print(arr[k]+" ");
		}
		
	}

}
