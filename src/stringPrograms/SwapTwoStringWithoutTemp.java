package stringPrograms;

public class SwapTwoStringWithoutTemp {
	
	public static void main(String[] args) {
		
		String a = "Priyanka";
		
		String b = "Vikrant";
		
		a = a + b;
		
		b = a.substring(0, a.length()-b.length());
		
		a = a.substring(b.length());
		
		System.out.println(a);
		
		System.out.println(b);
	}

}
