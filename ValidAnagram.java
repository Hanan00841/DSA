package infor;
import java.util.*;
public class ValidAnagram {
	public static void main(String[] args)
	{
		//s and t are going to be lower case
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string s:");
		String s=sc.next();
		System.out.println("Enter the string t:");
		String t=sc.next();
		boolean flag=true; //we initially assume t is a valid anagram of s
		if(s.length()!=t.length())
		{
			flag=false;
		}
		else
		{
			HashMap<Character,Integer> map=new HashMap<>();
			for(int i=0;i<s.length();i++)
			{
				map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
			}
			for(int i=0;i<t.length();i++)
			{
				map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
			}
			for(int i=0;i<s.length();i++)
			{
				if(map.get(s.charAt(i))!=0)
				{
					flag=false;
					break;
				}
			}
		}
		if(flag==true)
		{
			System.out.println(t+" is a valid anagram of "+s);
		}
		else
		{
			System.out.println(t+" is NOT a valid anagram of "+s);
		}
			
	}

}
