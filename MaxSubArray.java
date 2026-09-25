package infor;
import java.util.*;
public class MaxSubArray {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int maxSum=arr[0];
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]>maxSum)
			{
				maxSum=arr[i];
			}
			int sum=arr[i];
			for(int j=i+1;j<n;j++)
			{
				sum=sum+arr[j];
				if(sum>maxSum)
				{
					maxSum=sum;
				}
			}
		}
		if(arr[n-1]>maxSum)
		{
			maxSum=arr[n-1];
		}
		System.out.println("The maximum subarray is:"+maxSum);
	}

}
