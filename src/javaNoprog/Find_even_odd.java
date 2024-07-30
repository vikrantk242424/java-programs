package javaNoprog;

import java.util.Scanner;

public class Find_even_odd {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter value of a");
		
		int a = sc.nextInt();
		
	//	int a= 9;
		
		if(a % 2 == 0) {
			
			System.out.println("even no.");	
		}
		
		else {
			
			System.out.println("odd no.");
		}
		
	}

}
