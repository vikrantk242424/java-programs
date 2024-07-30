package javaNoprog;

public class PalindromeNo {
	
	public static void main(String[] args) {
		
		int orgNo = 121;
		
		int mNo = orgNo;
		
		int revNo = 0;
		
		int rem;
		
		while(mNo > 0) {
			
			rem = mNo % 10;
			
			revNo = revNo*10 + rem;
			
			mNo = mNo/10;
		}
		
		if(orgNo==revNo) {
			
			System.out.println("palindrome no");
		}
		
		else {
			
			System.out.println("not Palindrome no");
		}
	}

}
