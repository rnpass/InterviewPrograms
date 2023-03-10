package javapracticecodes;

public class SwapString {

	public static void main(String[] args) {
		
		String str1= "sudarshan";
		String str2= "chavan";
		
		// 1. Using third string 
		
//		String temp="";
//		
//		temp=str1;
//		str1=str2;
//		str2=temp;
//		
//		System.out.println(str1);
//		System.out.println(str2);
		
		
		
		//2. without third string
		
		str1= str1+str2;
		System.out.println(str1);
		
	    str2 =str1.substring(0, (str1.length()-str2.length()));
		System.out.println(str2);
		
		str1 =str1.substring(str2.length());
		System.out.println(str1);

	}

}
