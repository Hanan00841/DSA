package infor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class HashingGroupAnagrams {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of strings:");
		int n=sc.nextInt();
		String[] arr=new String[n];
		System.out.println("Enter the strings:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		HashMap<String,List<String>> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			//we can't sort a string directly so we convert it into a character array and sort that 
			//then convert the sorted character arr back to a string
			//the sorting is done so that all anagrams generate a common key
			char[] carr=arr[i].toCharArray();
			Arrays.sort(carr);
			String sorted=new String(carr); //we can't use toString() here
			//new String() creates a String using the contents of the character array
			//toString returns the string representation of the object
			if(map.containsKey(sorted))
			{
				map.get(sorted).add(arr[i]);
			}
			else
			{
				map.putIfAbsent(sorted,new ArrayList<>());
				map.get(sorted).add(arr[i]);
			}
		}
		System.out.println(map);
	}

}
