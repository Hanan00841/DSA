package infor;
import java.util.Scanner;
public class ValidAnagramOptimal {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string s:");
		String s=sc.next();
		System.out.print("Enter the string t:");
		String t=sc.next();
		int[] freq=new int[26];
		boolean flag=true;
		if(s.length()!=t.length())
		{
			flag=false;
		}
		else
		{
			//YOU CAN COMBINE LOOP 1 AND 2 
			for(int i=0;i<s.length();i++)
			{
				freq[s.charAt(i)-97]++; //can also be freq[s.charAt(i)-'a']; 97 is used because it is the ASCII value of 'a'. If we encounter 'a' we want its count to be stored at index 0. e.g. s.chartAt(i)='a' then freq[s.charAt(i)] will be freq[97] which is why we add -97 to make freq[a]->freq[0]
				
			}
			for(int i=0;i<t.length();i++)
			{
				freq[t.charAt(i)-97]--;
			}
			//the below loop can also be i 0->25
			for(int i=0;i<s.length();i++)
			{
				if(freq[s.charAt(i)-97]!=0)
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
