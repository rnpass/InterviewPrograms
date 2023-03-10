package javapracticecodes;

public class ReverseString {

	public static void main(String[] args) {
		String str = "India is my country";
		// output= "aidnI si ym yrtnuoc"

//		String word[] = str.split(" ");
//		String rev = "";
//
//		for (int i = 0; i < word.length; i++) {
//			String str2 = word[i];
//			for (int j = str2.length() - 1; j >= 0; j--) {
//				rev = rev + str2.charAt(j);
//
//			}
//			word[i] = rev;
//
//		}
//		for (int i = 0; i < word.length; i++) {
//
//			System.out.print(word[i] + " ");
//
//		}
//
//		System.out.println();

		String str1[] = str.split(" ");

		for (int i = 0; i < str1.length; i++) {
			String str2 = str1[i];
			String rev1 = "";
			for (int j = str2.length() - 1; j >= 0; j--) {
				rev1 = rev1 + str2.charAt(j);
			}
			str1[i] = rev1;
		}

		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i] + " ");
		}

	}

}
