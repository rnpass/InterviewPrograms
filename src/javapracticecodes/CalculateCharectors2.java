package javapracticecodes;

public class CalculateCharectors2 {

	public static void main(String[] args) {
		String str = "sudarshan shahaji chavan";
		int count[]=new int[300];
		
		for(int i=0;i<str.length();i++)
		{
			count[(int)str.charAt(i)]++;
		}
		for(int i=0; i<300;i++)
		{
			if(count[i]!=0)
			{
				System.out.println((char)i+"="+count[i]);
			}
		}
	}

}
