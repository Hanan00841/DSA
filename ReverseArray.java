package infor;
import java.util.*;
public class ReverseArray {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of array elements:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n/2;i++)
		{
//			if(i<n-i-1)
//			{
				int temp=arr[i];
				arr[i]=arr[n-i-1];
				arr[n-i-1]=temp;
//			}
		}
		System.out.println("The rotated array elements are:");
		for(int elem:arr)
		{
			System.out.print(elem+" ");
		}
	}

}
