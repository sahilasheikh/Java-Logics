import java.util.Scanner;

public class Problem_005_Array_Delete_Value {

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
		 * 				3. declare the boolean to store the status and print an array
		 * 				4. ask the value from the user which have to deleted from an given array
		 * 				5. initiate for loop start with 0 and end at ar.lenght
		 * 					  i. if element value is equal to user input:
		 * 					     a. initiate for loop start with i and end at (ar.lenght-1)
		 * 					        1. put the 'j+1' element's value at 'j'th element
		 * 					     b. store true in deleted variable
		 * 					     c. break the loop
		 * 					  ii. else:
		 * 					     a.   store false in deleted variable
		 * 				6. if deleted is true:
		 * 				      i. print: value deleted and print an array
		 * 				7. else:
		 * 				      i. print value not found
		 * 				7. stop
		 * 				
		 * Input/Output:
		 * 				Case 1:
		 * 				o/p: Array: 1 56 98 36 45 12 95 
		 * 				o/p: Enter Value to be delete
		 * 				i/p: 36
		 * 				o/p: Value deleted
		 * 				o/p: 1 56 98 45 12 95 
		 * 
		 * 				Case 2:
		 * 				o/p: Array: 1 56 98 36 45 12 95 
		 * 				o/p: Enter Value to be delete
		 * 				i/p: 100
		 * 				o/p: Value not found

		 */
		
	/*----------------------------------------PROGRAM----------------------------------------*/
		
		
		Scanner scan = new Scanner(System.in);
		
//		2. declare array int ar[] = {1, 56, 98, 36, 45, 12, 95};
		int ar[] = {1, 56, 98, 36, 45, 12, 95};

//		3. declare the boolean to store the status and print an array
		boolean deleted = false;
		
		System.out.print("Array: ");
		for (int j = 0; j < ar.length; j++) {
			System.out.print(ar[j] + " ");
		}
		
//		4. ask the value from the user which have to deleted from an given array
		System.out.println("\nEnter Value to be delete");
		int value = scan.nextInt();
		
//			5. initiate for loop start with 0 and end at ar.lenght
			for (int i = 0; i < ar.length; i++) {
//				i. if element value is equal to user input:
				if (ar[i] == value) {
//					a. initiate for loop start with 0 and end at (ar.lenght-1)
					for (int j = i; j < ar.length-1; j++) {
//						1. put the 'i+1' element's value at 'i'th element
						ar[j] = ar[j+1];
					}
//					b. store true in deleted variable
					deleted = true;
//					c. break the loop
					break;
				}
//				ii. else:
				else {
//					a.   store false in deleted variable
					deleted = false;
				}
			}
			
//			 6. if deleted is true:
			if (deleted) {
//				i. print: value deleted and print an array
				System.out.println("Value deleted");
				for (int j = 0; j < ar.length-1; j++) {
					System.out.print(ar[j] + " ");
				}
			}
//			7. else: 
			else {
//				i. print value not found
				System.out.println("Value for found");
			}
	
		scan.close();						// this will close the scanner
		
		
	}

}
