package infor;
import java.util.*;
public class MaxSubArrayKadane {
	public static void main(String[] args)
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
		int currentSum=arr[0];
		int maxSum=arr[0];
		
		for(int i=1;i<n;i++)
		{
			//should i add this element to the existing sub array or is it better to start a new sub array from here
			currentSum=Math.max(arr[i], currentSum+arr[i]);
			//is the updated sub array the highest in value so far 
			maxSum=Math.max(currentSum, maxSum);
		}
		System.out.println("The maximum subarray is:"+maxSum);
	}

}
