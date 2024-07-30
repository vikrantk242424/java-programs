package javaNoprog;

import java.util.Scanner;

public class Even_Odd_No {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter no. a =  ");
		
		int a = sc.nextInt();
		
		if(a % 2 ==0) {
			
			System.out.println("even no.");
		}
		
		else {
			
			System.out.println("odd no.");
		}
		
	}

}
