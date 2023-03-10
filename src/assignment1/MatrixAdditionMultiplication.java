package assignment1;

public class MatrixAdditionMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[][] = {{3,2},{45,78}};
		int a2[][] = {{4,5},{22,9}};
		
		int add [][] = new int[a1.length][a1[0].length];
		int add1 [][] = new int[a2.length][a2[0].length];
		
		// addition
		
		add1 [0][0]= a1[0][0] + a2[0][0];
		add1 [0][1]= a1[0][1] + a2[0][1];
		add1 [1][0]= a1[1][0] + a2[1][0];
		add1 [1][1]= a1[1][1] + a2[1][1];
		
		System.out.println("Array addition is :- ");
		
		System.out.println(add1 [0][0]+" "+add1 [0][1] );
		
		System.out.println(add1 [1][0] + " "+ add1 [1][1]);
		 
		
		// multiplication
		
		int mul[][] = new int[a1.length][a1[0].length];
		
		mul[0][0]= a1[0][0]*a2[0][0] + a1[0][1]*a2[1][0];
		mul[0][1]= a1[0][0]*a2[0][1] + a2[0][1]*a2[1][1];
		mul[1][0]= a1[1][0]*a2[0][0] + a2[1][1]*a2[1][0];
		mul[1][1]= a1[1][1]*a2[0][1] + a2[0][1]*a2[1][1];
		
		System.out.println("Array multiplication is:- ");
		
		System.out.println(mul[0][0]+ " "+ mul[0][1]);
		System.out.println(mul[1][0]+ " "+ mul[1][1]);
		
		
		
	}

}
