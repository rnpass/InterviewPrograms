package interview.questions;

public class PrimeNumber2 {

	public static void main(String[] args) {
		
		int n=6;
		boolean flag= false;
		
		if ( n==0 || n==1)
			System.out.println(n+ " is not prime number");
		
		
		for (int i=2; i<=n/2; i++ )
		{
			if (n%i==0)
			{
				flag=true;
				break;
			}
			
		}
		if (!flag)
		{
			System.out.println(n+ " is prime number");
		}
		else 
			System.out.println(n+ " is not prime number");
	}

}
