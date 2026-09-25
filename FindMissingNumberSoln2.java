package infor;
import java.util.*;
public class FindMissingNumberSoln2 {
	public static void main(String[] args)
	{
		//integer overflow may occur if the largest is a big number because then int factorial won't be able to hold such a big value, then you can convert from int to long 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of array elements:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int largest=0;
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		
		//Calculating factorial
		int factorial=1;
		for(int i=2;i<=largest;i++)
		{
			factorial=factorial*i;
		}
		
		boolean containsZero=false;
		boolean containsOne=false;
		int product=1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
				containsZero=true;
			}
			else
			{
				if(arr[i]==1)
				{
					containsOne=true;
				}
				product=product*arr[i];
			}
		}
		int missing=0;
		if(product==factorial)
		{
			if(containsOne==false)
			{
				missing=1;
			}
			else if(containsZero==false)
			{
				missing=0;
			}
			else
			{
				missing=n;
			}
		}
		else
		{
			missing=factorial/product;
		}
		System.out.println("The missing number is:"+missing);
	
	}

}
