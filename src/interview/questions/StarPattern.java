package interview.questions;

public class StarPattern {

	public static void main(String[] args) {

		// downword equlateral * traigle

//		
//		o/p * * * * *
//			 * * * *
//			  * * *
//			   * *
//			    *
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 5 - i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		// right angle tringle

//		A
//		12
//		ABC
//		1234
//		ABCDE

		int a = 65;
		for (int i = 1; i <= 5; i++) {
			if (i % 2 == 0) {
				for (int k = 1; k <= i; k++) {
					System.out.print(k);
				}
			} else
				for (int j = 0; j < i; j++) {
					System.out.print((char) (a + j));
				}
			System.out.println();
		}
		
		
		// downword ringht angle tringle
//		   55555
//		   4444
//		   333
//		   22
//		   1
		System.out.println();
		for(int i=5; i>=0; i--)      //outer forloop for row
		{
			for(int j=0; j<i; j++)   //inner for loop for column
			{
				System.out.print(i);  
			}
			System.out.println();
		}
	}

}
