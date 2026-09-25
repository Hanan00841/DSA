package infor;
import java.util.*;
public class MoveZeroesToEndOfArray {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of array elements:");
		int n=sc.nextInt();
		int[] nums=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextInt();
		}
		nums=twoPointerSoln(nums);
		for(int el:nums)
		{
			System.out.print(el+" ");
		}
	}
	public static int[] threePointerSoln(int[] nums)
	{
		int i=0, j=0;
		int n=nums.length;
		for(int k=0; k<n; k++)
		{
			if(nums[k]!=0)
			{
				j=k;
			}
			else if(nums[i]!=0)
			{
				i=k;
			}
			
			if(j>i && nums[j]!=nums[i])
			{
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
				i++;
			}
		}
		return nums;
	}
	public static int[] twoPointerSoln(int[] nums)
	{
		int i=0;
		int n=nums.length;
		for(int j=1; j<n; j++)
		{
			if(nums[j]!=0 && nums[i]==0)
			{
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
				i++;
			}
			else if(nums[i]!=0)
			{
				i=j;
			}
			
		}
		return nums;
	}
	public static int[] chatGPTSoln(int[] nums)
	{
		//j scans the whole array when it encounters a non 0 it swaps with i and i moves ahead to find next 0
		//i starts at 0 it is meant to represent 0 closest to starting and move ahead each time there's a swap
		int i=0;
		int n=nums.length;
		for(int j=0; j<n; j++)
		{
			if(nums[j]!=0)
			{
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
				i++;
			}
			
			
		}
		return nums;
	}

}
