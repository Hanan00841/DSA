package infor;
import java.util.*;
public class BuyAndSellStock {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of array elements:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the stock prices:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int profit=firstTrial(arr);
		System.out.println("Maximum profit from 1st method:"+profit);
		profit=secondTrial(arr);
		System.out.println("Maximum profit from 2nd method:"+profit);
	}
	public static int firstTrial(int[] arr)
	{
		int n=arr.length;
		int profit=0;
		for(int i=0;i<n-1;i++)
		{
			
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]-arr[i]>profit)
				{
					profit=arr[j]-arr[i];
				}
			}
		}
		return profit;
	}
	//If the stock is at so far lowest price then update minPrice
	// If stock is not at so far lowest, check whether profit from selling it today is greater than current maxProfit
	// assuming you bought it when it was as minPrice
	public static int secondTrial(int[] arr)
	{
		int n=arr.length;
		int minPrice=arr[0];
		int maxProfit=0;
		for(int i=1;i<n;i++)
		{
			if(arr[i]<=minPrice)
			{
				minPrice=arr[i];
			}
			else if(arr[i]-minPrice>maxProfit)
			{
				maxProfit=arr[i]-minPrice;
			}
		}
		return maxProfit;
	}

}
