package interview.questions;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("java"+10+20); //java1020
		System.out.println(10+20+"java"); //30java
		System.out.println("java"+10*20); //java200
		System.out.println(10*20+"java"); //200java
		
		
		int i,  flag = 0;
		int n = 3;// it is the number to be checked
		
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
			
		} else {
			for (i = 2; i <= n/2; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag =1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		} // end of else
	}
}
