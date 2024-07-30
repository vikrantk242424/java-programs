package javaNoprog;

public class Palindrome_No {
	
	public static void main(String[] args) {
		
		int originalNo = 121;
		
		int modifiedNo = originalNo;
		
		int reverseNo = 0;
		
		int remainder;
		
		while(modifiedNo>0) {
			
			remainder = modifiedNo % 10;
			
			reverseNo = reverseNo*10 + remainder;
			
			modifiedNo = modifiedNo/10;
		}
		
	
		if(originalNo==reverseNo) {
			
			System.out.println("original no. is palindrome No");
		}
		
		else {
			
			System.out.println("original no. is not palindrome No");
			
		}
		
	}

}
