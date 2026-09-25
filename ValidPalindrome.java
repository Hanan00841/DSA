package infor;
import java.util.Scanner;
public class ValidPalindrome {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		//next() reads only till the first space nextLine() reads till you press Enter
		String str=sc.nextLine();
		//convert all characters to one case
		str=str.toLowerCase();
		int i=0;
		int j=str.length()-1;
		boolean flag=true; //we initially assume that the string IS a valid palindrome
		while(i<j)
		{
			//i<j is added in case the string only contains special characters then i would keep incrementing till it went out of bounds
			while( i<j && !Character.isLetterOrDigit(str.charAt(i)))
			{
				i++;
			}
			while(i<j && !Character.isLetterOrDigit(str.charAt(j)))
			{
				j--;
			}
			if(str.charAt(i)!=str.charAt(j))
			{
				flag=false;
				break;
			}
			i++;
			j--;
		}
		if(flag==true)
		{
			System.out.println(str+" is a valid palindrome!");
		}
		else
		{
			System.out.println(str+" is NOT a valid palindrome!");
		}
	}
	
}
