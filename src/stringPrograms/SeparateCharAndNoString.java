package stringPrograms;

public class SeparateCharAndNoString {

	public static void main(String[] args) {

		String s1 = "Nidhi@0210";

		StringBuilder alpha = new StringBuilder("");

		StringBuilder num = new StringBuilder("");

		StringBuilder special = new StringBuilder("");

		for (int i = 0; i < s1.length(); i++) {

			char ch = s1.charAt(i);

			if(Character.isLetter(ch)) {

				alpha.append(ch);
				
				

			}

			else if (Character.isDigit(ch)) {

				num.append(ch);
			}

			else
				special.append(ch);

		}

		System.out.println(alpha);

		System.out.println(num);

		System.out.println(special);
	}

}
