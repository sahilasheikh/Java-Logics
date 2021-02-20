import java.util.Scanner;

public class Problem_004_Array_Delete_Element {

	public static void main(String[] args) {
		
		/* 
		 * Task:
		 * 				Delete the value from an array, take value from user as input after printing the array.
		 * 				Note: array has all unique values, and array is not sorted.
		 * 				ar[] = 1, 56, 98, 36, 45, 12, 95
		 * 				put value = user input
		 * 
		 * Solution/Algo:
		 * 				1. start
		 * 				2. declare array int ar[] = {1, 56, 98, 36, 45, 12, 95};
		 * 				3. print the given array
		 * 				4. ask the value from the user which have to deleted from an given array
		 * 				5. initiate for loop start with 0 and end at ar.lenght
		 * 					  a. if (ar[i] == ar[ar.length -1]) && (ar[ar.length-i] != user input):
		 * 					     i. print: value not found in given array
		 * 					  b. else if user input is equals ar[i]:
		 * 					     i.   delete the value: ar[i] = 0
		 * 						 ii.  print: deleted
		 * 		  				 iii. print the array
		 * 					     iv.  break the loop
		 * 					  c. else do nothing.
		 * 				6. stop
		 * 				
		 * Input/Output:
		 * 				Case 1:
		 * 				o/p: Array: 1 56 98 36 45 12 95 
		 * 				o/p: Enter value which you want to delete
		 * 				i/p: 36
		 * 				o/p: Value deleted
		 * 				o/p: 1 56 98 0 45 12 95 
		 * 
		 * 				Case 2:
		 * 				o/p: Array: 1 56 98 36 45 12 95 
		 * 				o/p: Enter value which you want to delete
		 * 				i/p: 100
		 * 				o/p: Given value not found in an array

		 */
		
	/*----------------------------------------PROGRAM----------------------------------------*/
		
		
		Scanner scan = new Scanner(System.in);
		
//		2. declare array int ar[] = {1, 56, 98, 36, 45, 12, 95};
		int[] ar = {1, 56, 98, 36, 45, 12, 95};
		
//		3. print the given array
		System.out.print("Array: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		
//		4. ask the value from the user which have to deleted from an given array
		System.out.println("\nEnter value which you want to delete");
		int val = scan.nextInt();
		
//		5. initiate for loop start with 0 and end at ar.lenght
		for (int i = 0; i < ar.length; i++) {
//			if (ar[i] == ar[ar.length -1]) && (ar[ar.length-i] != user input):
			if ((ar[i] == ar[ar.length-1]) && (ar[i] != val)) {
//				i. print: value not found in given array
				System.out.println("Given value not found in an array");
			}
//			b. else if user input is equals ar[i]:
			else if (val == ar[i]) {
//				i.   delete the value: ar[i] = 0
				ar[i] = 0;
//				ii.  print: deleted
				System.out.println("Value deleted");
//				iii. print the array
				for (int j = 0; j < ar.length; j++) {
					System.out.print(ar[j] + " ");
				}
//				iv. break the loop
				break;
			}
			
		}
		
		scan.close();						// this will close the scanner
		
	}

}
