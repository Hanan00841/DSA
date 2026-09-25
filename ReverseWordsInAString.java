package infor;
import java.util.Scanner;
public class ReverseWordsInAString {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		String[] words=str.trim().split("\\s+");
		int i=0;
		int j=words.length-1;
		while(i<j)
		{
			String temp=words[i];
			words[i]=words[j];
			words[j]=temp;
			i++;
			j--;
		}
		System.out.println("The new string is:");
		for(int k=0;k<words.length;k++)
		{
			System.out.print(words[k]+" ");
		}
		
	}

}
