package infor;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class HashingContainsDuplicates {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of array elements:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Set<Integer> set=new HashSet<>();
		boolean flag=false; //initially assume all elements in arr are distinct
		for(int i=0;i<n;i++)
		{
			if(set.contains(arr[i]))
			{
				flag=true;
				break;
			}
			else
			{
				set.add(arr[i]);
			}
		}
		System.out.println("There are repeating elements in this array:"+flag);
		
	}

}
