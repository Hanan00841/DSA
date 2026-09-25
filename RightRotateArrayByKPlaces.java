package infor;
import java.util.*;
public class RightRotateArrayByKPlaces {

	public static void main(String[] args)
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
		System.out.println("Enter the value of k/no.of rotations:");
		int k=sc.nextInt();
		k=k%n;
		//Reverse the section that moves ahead
		for(int i=0;i<n-k;i++)
		{
			int temp=arr[n-k-i];
			arr[n-k-i]=arr[i];
			arr[i]=temp;
		}
		//Reverse the section that moves to the back
		int cnt=0;
		for(int i=n-k;i<n;i++)
		{
			int temp=arr[n-cnt-1];
			arr[n-cnt-1]=arr[i];
			arr[i]=temp;
			cnt++;
		}
		//Reverse the whole array
		for(int i=0;i<n;i++)
		{
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		System.out.println("The rotated array elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
