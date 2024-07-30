package rahulShettyPrograms;

public class ArrayUniqueNo {

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4, 5, 6, 2, 3, 3 };

		for (int i = 0; i < ar.length; i++) {

			boolean flag = true;

			for (int j = 0; j < ar.length; j++) {

				if (i !=j && ar[i] == ar[j]) {

					flag = false;

					break;

				}

			}

			if (flag) {

				System.out.println("unique no. is "+ar[i]);
			}

		}

	}

}
