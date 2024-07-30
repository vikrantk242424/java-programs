package stringPrograms;

public class ConvertFirstCharOfEachWordToUppercase {

	public static void main(String[] args) {

		String s1 = "nidhi chandrakant chamle";

		String[] ar = s1.split(" ");

		for (int i = 0; i < ar.length; i++) {

			String word = ar[i];

			String upperCaseString = word.substring(0, 1).toUpperCase() + word.substring(1);
			
			System.out.println(upperCaseString);

		}

	}

}
