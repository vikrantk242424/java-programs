package javaNoprog;

public class Factorial {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		int fact = 1;
		
		for(int i=1;i<=a;i++) {
			
			fact = fact *i;
			
		}
		
		System.out.println("factorial" + " of" + " No"+ " is" + " = " + fact);
		
	}

}
