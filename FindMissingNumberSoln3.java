package infor;
import java.util.*;
public class FindMissingNumberSoln3 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of array elements:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the number of array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int xor=n;
		//i is also included in the xor because it represents the actual correct sequence
		//when i and arr[i] do no match that i represents the missing number
		for(int i=0;i<n;i++)
		{
			xor=xor^i^arr[i];
		}
		System.out.println("The missing number is:"+xor);
		
	}

}
