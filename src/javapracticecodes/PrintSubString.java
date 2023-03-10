package javapracticecodes;

public class PrintSubString {

	public static void main(String[] args) {
		String str = "ABBBDFJGGDFABFJFHYDAB";
		
		String arr[]= str.split("AB");
		
		System.out.println(arr[1]);
		System.out.println(arr[2]);

	}

}
