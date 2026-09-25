package infor;
import java.util.*;
public class LongestConsecutiveSequence {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of array elements:");
		int n=sc.nextInt();
		Set<Integer> set=new HashSet<>();
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			set.add(num); //HashSet only stores distinct elements so DUPLICATES GET AUTOMATICALLY REMOVED
		}
		int cnt=0;
		int maxCnt=0;
		for(int num:set)
		{
			if(!set.contains(num-1)) //if num starts the sequence, we check how many elements are consecutive to it
			{
				cnt=1;
				while(set.contains(num+cnt))
				{
					cnt++;
				}
				maxCnt=Math.max(maxCnt, cnt);
			}
		}
		System.out.println("The Longest Consecutive Subsequence contains "+maxCnt+" elements");
	}

}
