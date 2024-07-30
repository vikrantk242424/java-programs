package stringPrograms;

public class NoOfWhiteSpaces {

	public static void main(String[] args) {

		String s1 = "Java program  is easy";

		int spaceCount = 0;

		for (int i = 0; i < s1.length(); i++) {

			char ch = s1.charAt(i);

			if (ch == ' ') {

				spaceCount++;
			}
		}

		System.out.println(spaceCount);

	}

}
