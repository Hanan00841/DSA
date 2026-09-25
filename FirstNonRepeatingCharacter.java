package infor;
import java.util.Scanner;
public class FirstNonRepeatingCharacter {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word:");
		String str=sc.next();
		str=str.toLowerCase();
		int[] freq=new int[26];
		char ch=' ';
		int index=-1;
		for(int i=0;i<str.length();i++)
		{
			freq[str.charAt(i)-97]++;
		}
		for(int i=0;i<str.length();i++)
		{
			if(freq[str.charAt(i)-97]==1)
			{
				ch=str.charAt(i);
				index=i;
				break;
			}
		}
		System.out.println("The first non-repeating character in "+str+" is "+ch+" at index "+index);
	}

}
