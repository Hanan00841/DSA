package infor;
import java.util.*;
public class LongestCommonPrefixOptimal {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of strings:");
		int n=sc.nextInt();
		String[] arr=new String[n];
		System.out.println("Enter the strings:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		//Time complexity of sorting is O(n log n)
		Arrays.sort(arr);//Arrays.sort() belongs to java.util.Arrays
		//It sorts the strings in dictionary order
		
		//We need to compare only the first and the last string since they are the most different
		//What is common to them will be common to all the other strings too
	
		String prefix="";
		for(int i=0;i<arr[0].length();i++)
		{
			if(i<arr[n-1].length() && arr[0].charAt(i)==arr[n-1].charAt(i))
			{
				prefix=prefix+arr[0].charAt(i);
			}
			else
			{
				break;
			}
		}
		System.out.println("The longest common prefix is:"+prefix);
	}

}
