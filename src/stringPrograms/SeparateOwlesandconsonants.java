package stringPrograms;

public class SeparateOwlesandconsonants {

	public static void main(String[] args) {

		String s1 = "abcdefghijklmnou";

		StringBuilder vowels = new StringBuilder();
		
		int countVowels = 0;
		
		int countConsonants = 0;

		StringBuilder consonants = new StringBuilder();

		for (int i = 0; i < s1.length(); i++) {

			char ch = s1.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

				vowels.append(ch);
				
				countVowels++;
			}

			else {

				consonants.append(ch);
				
				countConsonants++;
			}

		}
		
		System.out.println(vowels);
		
		System.out.println(countVowels);
		
		System.out.println(consonants);
		
		System.out.println(countConsonants);

	}

}
