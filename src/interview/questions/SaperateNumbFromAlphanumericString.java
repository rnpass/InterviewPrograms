package interview.questions;

public class SaperateNumbFromAlphanumericString {

	public static void main(String[] args) {
		String str = "asd3f4fr6";
		boolean flag = false;
//		for(int i=0; i<str.length();i++)
//		{
//			char ch=str.charAt(i);
//			if( flag= Character.isDigit(ch) )
//			{
//				
//				System.out.println("digit ="+ch);
//			}
//			
//		}
		
		
		char ch1[] = str.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			 

				if (ch1[i]>='0' && ch1[i]<='9') // comparing numbers to charectors also
				{
					System.out.println("digit =" + ch1[i]);
				} 
				else 
				{
					System.out.println("char = " + ch1[i]);
				}
			}
		}
	}


