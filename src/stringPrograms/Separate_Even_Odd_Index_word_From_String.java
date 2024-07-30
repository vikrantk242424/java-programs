package stringPrograms;

public class Separate_Even_Odd_Index_word_From_String {

	public static void main(String[] args) {

		String s1 = "abc def ghij klmn pqrs";

		StringBuilder evenIndex = new StringBuilder("");

		StringBuilder oddIndex = new StringBuilder("");

		String[] ar = s1.split(" ");

		for (int i = 0; i < ar.length; i++) {

			String word = ar[i];

			if (i % 2 == 0) {

				evenIndex.append(word+" ");

			}

			else {

				oddIndex.append(word+" ");
			}
		}

		System.out.println(evenIndex);

		System.out.println(oddIndex);

	}

}
