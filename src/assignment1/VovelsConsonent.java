                                                                 package assignment1;

public class VovelsConsonent {

	public static void main(String[] args) {
		
		
		int vCount=0;
		int cCount=0;
		
		char str[] = {'s', 'u','d','a','r','s','h','a','n'};
		
		
		for(int i=0; i<str.length; i++)
		{
			if( str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str [i] == 'o' || str[i] == 'u' )
			{
			 vCount++;
			}
			else
			{
				cCount++;
			}
		}
		System.out.println("vowel="+vCount);		
		System.out.println("consonents="+cCount);	

	}

}
