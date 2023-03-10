package interview.questions;

public class StringPalindrom {

	public static void main(String[] args) {
		// string palindrom

				String a = "a man a plan a canal panama "; // without space string is palindrom

				String st = a.replaceAll("\\s", "");
				System.out.println(st);

				String rs = "";
				for (int i = st.length() - 1; i >= 0; i--) {
					rs = rs + st.charAt(i);
				}
				if (st.equals(rs)) {
					System.out.println(rs);
					System.out.println("s is palindrom");
				} else {
					System.out.println("str is not palindrom");
				}

	}

}
