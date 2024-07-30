package array_Programs;

import java.util.Arrays;

public class ArrayLargestUsingSort {
	
	public static void main(String[] args) {
		
		// largest no. using Arrays.sort
		
		int[] ar1 = {10,20,50,80,1,60};
		
	    Arrays.sort(ar1);
	    
	 int largNo  = ar1[ar1.length-1];   // to get largest
	 
	 System.out.println(largNo);
		
		
	}

}
