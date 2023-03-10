package assignment1;

import java.util.Scanner;

public class ScannerClass2 {

	public static void main(String[] args) {

		int password = 1357;
		Scanner sc = new Scanner(System.in);
		int flag=0;
		

		System.out.println("Enter password");
		int a = sc.nextInt();

        for (int i=0; i<3; i++)
        {
        	if (a==password)
        	{
        		System.out.println("logged in successfully");
        		break;
        	}
        	else
        	{
        		System.out.println("incorrect password");
        		flag++;
        	}
        	if (flag==3)
        	{
        		System.out.println("login after 24 hrs");
        	}
        }
		
	}
}
