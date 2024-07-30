package rahulShettyPrograms;

public class ArraySum {

	public static void arraySum() {

		int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = 0;

		for (int i = 0; i < ar.length; i++) {

			int no = ar[i];

			sum = sum + no;

		}
		
		System.out.println(sum);

	}

	public static void main(String[] args) {
		
		arraySum();

	}

}
