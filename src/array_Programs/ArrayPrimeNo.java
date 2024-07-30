package array_Programs;

public class ArrayPrimeNo {

	public static void main(String[] args) {

		int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

		for (int i = 0; i < ar.length; i++) {

			int no = ar[i];
			
			boolean flag = false;

			for (int j = 2; j <= no/2; j++) {
				

				if (no % j == 0) {

					flag = true;
					
					break;
					
				}
				
			}
			
			if(flag || no==1) {
				
				//System.out.println("not prime no. "+ar[i]);
			}
			
			else {
				
				System.out.println("prime no. "+ar[i]);
			}

		}

	}

}
