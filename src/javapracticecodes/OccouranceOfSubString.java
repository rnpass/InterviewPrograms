package javapracticecodes;

public class OccouranceOfSubString {

	public static void main(String[] args) {
		//  Number of occurance of substring from given string   substring - ajay
		
		
		String str = "My name is ajay . ajay is boy. ajay play cricket";
		
		String str2[]= str.split(" ");
		int count=0;

//		for(int i=0; i<str2.length; i++)
//		{
//			System.out.print(str2[i]+" ");
//		}
		
		String substring="ajay";
		
		for(int i=0; i<str2.length;i++)
		{
			if(substring.equals(str2[i]))
			{
				count++;
			}
		}
		System.out.println(substring+"="+count);
	}

}
