package stringPrograms;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abcdefghijklmnop";

		StringBuilder reverse = new StringBuilder("");

		for (int i = s1.length() - 1; i >= 0; i--) {

			char ch = s1.charAt(i);

			reverse.append(ch);

		}

		System.out.println(reverse);

	}

}
