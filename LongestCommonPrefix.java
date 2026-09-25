package infor;
import java.util.Scanner;
public class LongestCommonPrefix {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of strings:");
		int n=sc.nextInt();
		String[] arr=new String[n];
		System.out.println("Enter the strings:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
		}
		String prefix="";
		//if is not needed the j loop will never execute if there's only one string
		if(arr.length==1)
		{
			prefix=arr[0];
		}
		else
		{
			for(int i=0;i<arr[0].length();i++)
			{
				char ch=arr[0].charAt(i);
				int cnt=1;
				for(int j=1;j<arr.length;j++)
				{
					if(arr[j].length()>i && arr[j].charAt(i)==ch)
					{
						cnt++;
					}
				}
				if(cnt==arr.length)
				{
					prefix+=ch;
				}
				else
				{
					break;
				}
			}
		}
		
		System.out.println("The longest common prefix is:"+prefix);
	}

}
