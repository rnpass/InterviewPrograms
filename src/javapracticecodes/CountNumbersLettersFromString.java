package javapracticecodes;

public class CountNumbersLettersFromString {

	public static void main(String[] args) {
		// percentage of digit,lowercaseletter,uppercase letter in
		// string str = "india is my country 3454564 dfghrtherth 567678 drfhft BBCH"

		String str = "india 2132 $^^$^% is my country SHHD 3454564 dfghrtherth 567678 drfhft BBCH ##$#$ HDHDH";
		int digit = 0, lowercase = 0, uppercase = 0, symbol = 0;

		String str2[] = str.split(" ");

		for (int i = 0; i < str2.length; i++) {
			char ch[] = str2[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {

				if (ch[j] >= '0' && ch[j] <= '9') {
					digit++;
					break;
				} else if (ch[j] >= 'a' && ch[j] <= 'z') {
					lowercase++;
					break;
				} else if (ch[j] >= 'A' && ch[j] <= 'Z') {
					uppercase++;
					break;
				} else {
					symbol++;
					break;
				}
			}
		}

		System.out.println("digit=" + digit);
		float dPer = ((digit * 100) / str2.length);
		System.out.println("digit per=" + dPer);

		System.out.println("lowercase=" + lowercase);
		float lPer = ((lowercase * 100) / str2.length);
		System.out.println("lowercase per=" + lPer);

		System.out.println("uppercase=" + uppercase);
		float uPer = ((uppercase * 100) / str2.length);
		System.out.println("uppercase per=" + uPer);

		System.out.println("symbol=" + symbol);
		float sPer = ((symbol * 100) / str2.length);
		System.out.println("symbol per=" + sPer);

	}

}
