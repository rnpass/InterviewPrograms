package assignment1;

public class SumOfArray {

	public static void main(String[] args) {
		
		int s[]= {1,3,4,12,10};
		
		int sum=0;
		
		for(int i=0; i<s.length; i++)
		{
			sum = sum+ s[i];
		}
		
		System.out.println("Sum of all elements of array: "+sum);

	}

}
