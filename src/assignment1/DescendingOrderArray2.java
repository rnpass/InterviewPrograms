package assignment1;
//Java program to sort the elements in descending order
import java.util.*;

class DescendingOrderArray2 {
 public static void main(String[] args)
 {
	 
	 int array[] = {1,1,11,11,14,14,54,54,11,21,31,21,31,0};
	 
	// Arrays.sort(array, Collections.reverseOrder());
	 
	/* Arrays.sort(array);
	 
	// reverse(array);
	 
	 
	 System.out.print("Elements in original way: ");
	 for (int i=0; i<array.length; i++)
	 {
		 System.out.print(array[i]+ " ");
		 
		 
	 }*/
	 int temp= 0;
	 for (int i=0; i<array.length; i++)
	 {
		 for(int j=i+1; j<array.length; j++)
		 {
			 if (array[i]<array[j])
			 {
				 temp = array[i];
				 array[i]=array[j];
				 array[j]=temp;
			 }
		 }
	 }
	 System.out.println();
	 System.out.println("Elements of array sorted in descending order: ");
	 
	 for (int i=0; i<array.length; i++)
	 {
		 System.out.print(array[i]+ " ");
	 }
 }
}
