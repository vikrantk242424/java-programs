package javaNoprog;

public class StringFirstLetterUppercase {

	public static void main(String[] args) {

		String s1 = "priyanka vikrant kotwade";

		String ar[] = s1.split(" ");

		for (int i = 0; i < ar.length; i++) {

			int lengthOfString = ar[i].length(); // length of split string

			System.out.println(lengthOfString);

			String word = ar[i];

			// here substring(startingIndex , endingIndex-1)
			// here end index value gets -1
			// eg. priyanka substring(2,5) will start from index to 2 to end index (5-1) 4
			// so we will get iya

			String upper = word.substring(0, 1).toUpperCase() + word.substring(1, word.length());

			System.out.println(upper);

		}

	}

}