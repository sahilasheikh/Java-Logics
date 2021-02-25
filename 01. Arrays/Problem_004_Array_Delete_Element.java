import java.util.Scanner;


public class Problem_004_Array_Delete_Element {

	public static void main(String[] args) {
		
		/* 
		 * Task:
		 * 				Delete the element from an array, take element's value from user as input after printing the array.
		 * 				Note: array has all unique values, and array is not sorted.
		 * 				ar[] = 1, 56, 98, 36, 45, 12, 95
		 * 				put value = user input
		 * 
		 * Solution/Algo:
		 * 				1. start
		 * 				2. declare array int ar[] = {1, 56, 98, 36, 45, 12, 95};
		 * 				3. declare the boolean to store the status and print an array
		 * 				4. ask the element's value from the user which have to deleted from an given array
		 * 				5. if user input is less than 0 and greater than or equal to ar.length
		 * 				   a. store false in deleted variable
		 * 				6. else: 
		 * 				   a. initiate for loop start with 0 and end at ar.lenght
		 * 					  i. if element value is equal to user input:
		 * 					     a. initiate for loop start with i and end at (ar.lenght-1)
		 * 					        1. put the 'j+1' element's value at 'j'th element
		 * 					     b. store true in deleted variable
		 * 					     c. break the loop
		 * 					  ii. else:
		 * 					     i.   store false in deleted variable
		 * 				   b. if deleted is true:
		 * 				      i. print: element deleted and print an array
		 * 				   6. else: 
		 * 				      i. print element not found
		 * 				7. stop
		 * 				
		 * Input/Output:
		 * 				Case 1:
		 * 				o/p: Array: 1 56 98 36 45 12 95 
		 * 				o/p: Enter Element to be delete
		 * 				i/p: 5
		 * 				o/p: Element deleted
		 * 				o/p: 1 56 98 36 45 95 
		 * 
		 * 				Case 2:
		 * 				o/p: Array: 1 56 98 36 45 12 95 
		 * 				o/p: Enter Element to be delete
		 * 				i/p: 10
		 * 				o/p: Element not found
		 * 
		 * 				Case 3:
		 * 				o/p: Array: 1 56 98 36 45 12 95 
		 * 				o/p: Enter Element to be delete
		 * 				i/p: -5
		 * 				o/p: Element not found
		 */
		
	/*----------------------------------------PROGRAM----------------------------------------*/
		
		
		Scanner scan = new Scanner(System.in);
		
//		2. declare array int ar[] = {1, 56, 98, 36, 45, 12, 95};
		int[] ar = {1, 56, 98, 36, 45, 12, 95};
		
//		3. declare the boolean to store the status and print an array
		boolean deleted = false;
		System.out.print("Array: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		
//		4. ask the element's value from the user which have to deleted from an given array
		System.out.println("\nEnter value which you want to delete");
		int val = scan.nextInt();
		
//		5. if user input is less than 0 and greater than or equal to ar.length
		if (val < 0 || val >= ar.length) {
//			a. store false in deleted variable
			deleted = false;
		}
//		6. else: 
		else {
//			a. initiate for loop start with 0 and end at ar.lenght
			for (int i = 0; i < ar.length; i++) {
//				i. if element value is equal to user input:
				if (val == i) {
//					a. initiate for loop start with i and end at (ar.lenght-1)
					for (int j = i; j < ar.length-1; j++) {
//						1. put the 'j+1' element's value at 'j'th element
						ar[j] = ar[j+1];
					}
//					b. store true in deleted variable
					deleted = true;
//					c. break the loop
					break;
				}
//				ii. else:
				else {
//					i.   store false in deleted variable
					deleted = false;
				}
			}
		}
//		b. if deleted is true:
		if (deleted) {
//			i. print: element deleted and print an array
			System.out.println("Element Deleted");
			for (int i = 0; i < ar.length-1; i++) {
				System.out.print(ar[i] + " ");
			}
		}
//		6. else: 
		else {
//			i. print element not found
			System.out.println("Element not found");
		}
		
		
		scan.close();						// this will close the scanner
		
	}

}
