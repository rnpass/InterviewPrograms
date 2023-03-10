package assignment1;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		int password = 1357;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter password");
		int a = sc.nextInt();

		
		if (password == a) {
			System.out.println("logged in successsfully");
		} else {
			System.out.println("Intered password is incorect");
			System.out.println("Please try again");

		}

		int b = sc.nextInt();
		if (password == b) {
			System.out.println("logged in successsfully");
		} else {
			System.out.println("Intered password is incorect");
			System.out.println("Please try again");

		}

		int c = sc.nextInt();
		if (password == c) {
			System.out.println("logged in successsfully");
		} else {
			System.out.println("Intered password is incorect");
			System.out.println("Please try again");
		}
		int d = sc.nextInt();
		if (password == d) {
			System.out.println("logged in successsfully");
		} else {
			System.out.println("Intered password is incorect");
			System.out.println("Please try to login after 24 HRS");
		}
	}
}
