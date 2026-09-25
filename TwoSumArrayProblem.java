package infor;
import java.util.*;
public class TwoSumArrayProblem {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target:");
		int target=sc.nextInt();
		int[] soln=new int[2];
		soln=firstTrial(n,arr,target);
		System.out.println("The array indexes are:");
		for(int s: soln)
		{
			System.out.print(s+" ");
		}
		soln=secondTrial(n,arr,target);
		System.out.println("\n The array indexes according to 2nd soln are:");
		for(int s: soln)
		{
			System.out.print(s+" ");
		}
	}
	public static int[] firstTrial(int n, int[] arr, int target)
	{
		int[] soln=new int[2];
		outer:
		for(int i=0;i<n-1;i++)
		{

			for(int j=i+1;j<n;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					soln[0]=i;
					soln[1]=j;
					break outer; // or remove label and put return here
				}
			}
		}
		return soln;	
	}
	public static int[] secondTrial(int n, int[] arr, int target)
	{
		//Using  hash map since it has containsKey() to check if a possible match has already been encountered
		int[] soln=new int[2];
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			int needed=target-arr[i];
			if(map.containsKey(needed))
			{
				soln[0]=map.get(needed);
				soln[1]=i;
				return soln;
			}
			map.put(arr[i],i);
		}
		return soln;
	}
		

}
