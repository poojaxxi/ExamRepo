package Q1;

import java.util.Scanner;

public class WrapperExample 
{
	public static void main(String[] args) 
	{
		System.out.println("[Password Range:8-20,Begin with letter,1 Uppercase Char,1 Lowercase Char,1 Digit,1 Special Char(_,-,#,$)]");
		int x=0;
		while(x++<5)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Password: ");
			String s=sc.next();
			boolean res=verify(s);
			if(res)
			{
				System.out.println("Password Is Valid");
				System.out.println("Congratulations Your Password Is Set!");
				break;
			}
			else
			{
				System.out.println("Password is Invalid");
				continue;
			}
		}
	}
	public static boolean verify(String p)
	{
		int len=p.length();
		boolean firstletter=Character.isLetter(p.charAt(0));
		boolean oneUpp=false;
		boolean oneLow=false;
		boolean oneDig=false;
		boolean specialChar=false;
		for(int i=0;i<p.length();i++)
		{
			if(Character.isUpperCase(p.charAt(i)))
			{
				oneUpp=true;
			}
			if(Character.isDigit(p.charAt(i)))
			{
				oneLow=true;
			}
			if(Character.isDigit(p.charAt(i)))
			{
				oneDig=true;
			}
			if(p.charAt(i)=='_'||p.charAt(i)=='-'||p.charAt(i)=='#'||p.charAt(i)=='$')
			{
				specialChar=true;
			}
		}
		if(p.length()>=8 && p.length()<=20 && oneUpp && oneLow && oneDig && specialChar)
		{	
			return true;
		}
		return false;
	}
}
