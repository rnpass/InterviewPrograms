package javapracticecodes;

public class leapYear {

	public static void main(String[] args) {
		//leap year= year%4=0
		int year = 2020;
		
		if(year%4==0)
		{
			System.out.println("year is leap");
		}
		else {
			System.out.println("year is not leap");
		}
	}

}
