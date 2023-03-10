package javapracticecodes;

public class vovelorconsonent {

	public static void main(String[] args) {
		
		char ar[]= {'w','e','l','c','o','m','e'};
		int vC=0;
		int cC=0;
		
		for (int i=0; i<ar.length; i++)
			
		{
			if (ar[i]=='a'|| ar[i]=='e'||ar[i]=='i'||ar[i]=='o'||ar[i]=='u')
			{
				vC++;
			}
			else {
				cC++;
			}
		}
		System.out.println("vovels= "+vC);
		System.out.println("consonents= "+cC);
			

	}

}
