package interview.questions;

public class FibonacciSeries {

	public static void main(String[] args) {

//		int n1 = 0;
//		int n2 = 1;
//		int n3;
//		int count = 10;
//		System.out.print("Fibonacci Series: ");
//		System.out.print(n1 + " " + n2);
//
//		for (int i = 2; i < count; ++i) // loop starts from 2 coz o&1 are aalready printed
//		{
//			n3 = n1 + n2;
//			System.out.print(" " + n3);
//
//			n1 = n2;
//			n2 = n3;
//		}
	
	
    int[] a = {0,2,4,1,3} ;                                            
    for(int i = 0; i < a.length; i++)  
    {                                        
    a[i] = a[(a[i] + 3)% a.length]; 
   }    
    System.out.println(a[1]);
    

}
}
