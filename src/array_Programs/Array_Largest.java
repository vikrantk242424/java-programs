package array_Programs;

public class Array_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// array largest without using sort method
		
		int[] ar = {300,2,5,8,10,100,50,60};
		
		int largNo = ar[0];
		
		for(int i=0;i<ar.length;i++) {
			
			
			if(ar[i]>largNo) {
				
				largNo = ar[i];
			}
			
		}
		
		System.out.println("largest no from Array is = "+largNo);
		
   }

}
