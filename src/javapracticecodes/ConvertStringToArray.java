package javapracticecodes;

import java.util.Arrays;

public class ConvertStringToArray {

	public static void main(String[] args) {
		
		String str= "welcome to ktctc";
		
		String arr[]= str.split(" ");
		String st="";
		System.out.println(Arrays.toString(arr));
		
	
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		for(int i=0; i<arr.length;i++)
		{
			st= st+arr[i];
			
			
		}
		System.out.print(st);
	}

}
