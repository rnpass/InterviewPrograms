package interview.questions;

import java.util.Scanner;

public class NumberPalindrom {

	public static void main(String[] args) {

		// number palindrom
		int number = 414;
		int number1 = 414;
		int reminder = 0;
		int reverse = 0;
		while(number!=0)
		{
		reminder = number % 10;
		reverse = reverse * 10 + reminder;
		number = number / 10;
		}
		System.out.println(reverse);
		
		if (number1 == reverse) {

			System.out.println("number is palindrom");
		} else {
			System.out.println("number is not palondrom");
		}
	}
}
