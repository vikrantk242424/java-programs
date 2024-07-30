package rahulShettyPrograms;

import java.util.ArrayList;

public class ComparetwoindexofArraycreatearrayforcommon {

	public static void main(String[] args) {

		int[] a = { 2, 4, 5, 6, 7, 9 };

		int[] b = { 3, 5, 8, 9, 10 };

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {

				if (a[i] == b[j]) {

					al.add(a[i]);
				}

			}
		}
     
         Object[] obj =	al.toArray();
         
         // this is modified for loop for Array, ArrayList here int i=0;i<ar.length;i++ part is by default added in this form
         // we just have to add datatype-object and array var name-obj and put : in b/w them
         // now int no = ar[i];  this part is also coverd in this advance for loop
         // provide this no before :
         
         for(Object ob : obj) {
        	 
        	 System.out.println(ob);
        	 
         }
	}

}
