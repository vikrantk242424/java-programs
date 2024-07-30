package stringPrograms;

public class StringCountWithoutSpace {

	public static void main(String[] args) {

		String s1 = "Nidhi Chamle";
		
		System.out.println(s1.length());

		String s2 = " ";

		int count = 0;

		for (int i = 0; i < s1.length(); i++) {

			count++;
		}

		System.out.println("String count = " + count);
	}

}
