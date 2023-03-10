package javapracticecodes;

public class CountNumbersLetters {

	public static void main(String[] args) {
		//count number of digit,lowercaseletter,uppercase letter, specialCharacter 
		//in char array = {'a','2','B','q','4','F','#'};
		
		char arr[] = {'a','2','B','q','4','F','#','9'};
		int digit=0 , lowercase=0, uppercase=0, symbol=0;
		
		
//		for(int i=0; i<arr.length; i++)
//		{
//			if(arr[i]>='0' && arr[i]<='9')
//			{
//				digit++;
//			}
//			else if(arr[i]>='a' && arr[i]<='z')
//			{
//				lowercase++;
//			}
//			else if (arr[i]>='A' && arr[i]<='Z')
//			{
//				uppercase++;
//			}
//			else {
//				symbol++;
//			}
//		}
//		
//		System.out.println("digit="+digit);
//		System.out.println("lowercase="+lowercase);
//		System.out.println("uppercase="+uppercase);
//		System.out.println("symbol="+symbol);
//		System.out.println();
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>='0' && arr[i]<='9')
			{
				digit++;
			}
			else if(arr[i]>='a' && arr[i]<='z')
			{
				lowercase++;
			}
			else if (arr[i]>='A' && arr[i]<='Z')
			{
				uppercase++;
			}
			else {
				symbol++;
			}
		}
		int sum= arr.length;
		
		
		System.out.println("digit="+digit);
		float dPer= ((digit*100)/arr.length);
		System.out.println("digit per="+dPer);		
		
		System.out.println("lowercase="+lowercase);
		float lPer= ((lowercase*100)/arr.length);
		System.out.println("lowercase per="+lPer);
		
		System.out.println("uppercase="+uppercase);
		float uPer= ((uppercase*100)/arr.length);
		System.out.println("uppercase per="+uPer);
		
		System.out.println("symbol="+symbol);
		float sPer= ((symbol*100)/arr.length);
		System.out.println("symbol per="+sPer);
		


	}

}
