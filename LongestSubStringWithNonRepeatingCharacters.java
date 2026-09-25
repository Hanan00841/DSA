package infor;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class LongestSubStringWithNonRepeatingCharacters {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.next();
		Set<Character> set=new HashSet<>();
		int i=0;
		int max=0;
		//i tracks the starting of the subarray
		//when a duplicate is encountered we start from starting of subarray(using i) and remove characters till the duplicate is removed
		//j takes us through the entire string
		//at the end of each iteration we update max to hold the larger of the two-current max OR updated substring 
		for(int j=0;j<str.length();j++)
		{
			if(!set.contains(str.charAt(j)))
			{
				set.add(str.charAt(j));
			}
			else
			{
				while(set.contains(str.charAt(j)))
				{
					set.remove(str.charAt(i));
					i++;
				}
				set.add(str.charAt(j));
			}
			max=Math.max(max, j-i+1);
		}
		System.out.println("The longest sub string with non repeating characters has "+max+" characters");
		
	}

}
