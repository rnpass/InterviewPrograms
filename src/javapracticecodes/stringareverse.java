package javapracticecodes;

public class stringareverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string ="sudarshan";
		//Stores the reverse of given string  
		String reversedStr="";
		
        //Iterate through the string from last and add each character to variable reversedStr    

		for(int i=string.length()-1; i>=0;i--)
		{
			reversedStr = reversedStr + string.charAt(i);
		}
		
		System.out.println("reverse string: "+ reversedStr);

	}

	

}
