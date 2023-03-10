package practice;

public class ReverseNumber {

	public static void main(String[] args) {
           // using while loop
		int number= 1234, reverse=0;
		while(number !=0)
		{
			int reminder= number%10; //1234%10=4, 123%10=3, 12%10=2, 1%10=1
			reverse = reverse*10 +reminder; //0*10+4=4, 4*10+3=43, 43*10+2=432, 432*10+1=4321
			number= number/10; //1234/10=123, 123/10=12, 12/10= 1, 1/10= 0
		}
		System.out.println("The reverse of given number is: "+reverse);

		
		// using for loop
		
		int number1 =123456, reverse1=0, reminder1;
		
		for(;number1!=0; number1 =number1/10)
		{
			reminder1= number1%10;
			reverse1= reverse1*10 + reminder1 ;
		}
		System.out.println("The reverse of given number is: "+reverse1);
	
		
		for(;number1!=0;)
		{
			int reminder2 = number1%10;
			reverse1 = reverse1*10+reminder2;
			number= number/10;
		}
		System.out.println("The reverse of given number is: "+reverse1);
	
		
	}

}
