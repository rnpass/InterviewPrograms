package interview.questions;

public class RepetativeCharectors {

	public static void main(String[] args) {
		char arr[] = { 'a', 'b', 'c', 'd' };

		for (int i = 2; i <= 4; i++) {
			// o/p = {aabbccddee, aaabbbcccdddeee, aaaabbbbccccddddeeee}
			for (int j = 0; j < arr.length; j++) {
				System.out.println(" ");
				for (int k = 0; k <= j; k++) {
					System.out.print(arr[k]);

				}
			}

		}

	}

}
