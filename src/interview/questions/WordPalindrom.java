package interview.questions;

import java.util.Scanner;

public class WordPalindrom {

	public static void main(String[] args) {
		// word palindrom
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		
		String str= sc.nextLine();
		
		String s= "asdfdsa";
		String rs="";
		for(int i=str.length()-1; i>=0; i--)
		{
			rs=rs+str.charAt(i);
			
		}
		
		if(str.equals(rs))
		{
			System.out.println(rs);
			System.out.println("s is palindrom");
		}
		else
		{
			System.out.println("str is not palindrom");
		}

	}

}
