package stringPrograms;

public class FindLengthOfEachWord {

	public static void main(String[] args) {

		String s1 = "Nidhi Chandrkant Chamle";

		String[] ar = s1.split(" ");

		for (int i = 0; i < ar.length; i++) {

			System.out.println("length of word " + ar[i] + " is = " + ar[i].length());
		}

	}

}
