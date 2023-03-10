package javapracticecodes;

public class CalculateCharectors {

	public static void main(String[] args) {

		String str = "sudarshan chavan";
		frequencyOfCharacter(str);

	}

	public static void frequencyOfCharacter(String st1) {

		String st2 = "";
		for (int i = 0; i < st1.length(); i++) {

			int cnt = 0;

			for (int j = 0; j < i; j++) {

				if (st1.charAt(i) == st1.charAt(j)) {
					cnt++;
				}
			}

			if (cnt == 0) {
				st2 = st2 + st1.charAt(i);
			}
		}

		for (int i = 0; i < st2.length(); i++) {
			int count = 0;
			for (int j = 0; j < st1.length(); j++) {

				if (st2.charAt(i) == st1.charAt(j)) {
					count++;
				}
			}
			System.out.println(st2.charAt(i) + ": " + count);
		}
	}
}
