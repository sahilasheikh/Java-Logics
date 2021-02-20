import java.util.Scanner;

public class Problem_005_Array_Search_Element {

	public static void main(String[] args) {
		
		/* 
		 * Task:
		 * 				Search the value from an array and print the value's position in an array, take value from user.
		 * 				Note: array has all unique values, and array is not sorted.
		 * 				ar[] = 1, 56, 98, 36, 45, 12, 95
		 * 				put value = user input
		 * 
		 * Solution/Algo:
		 * 				1. start
		 * 				2. declare array int ar[] = {1, 56, 98, 36, 45, 12, 95};
		 * 				3. declare a boolean which will store the status true if value found and initiate the position int
		 * 				4. ask the value from the user which have to Search in an given array
		 * 				5. initiate for loop start with 0 and end at ar.lenght
		 * 					  a. if (ar[i] == user input):
		 * 						 i. status = true
		 * 						 ii. store i in position variable
		 * 						 iii. break the loop
		 * 					  b. else: do nothing
		 * 				6. check the status if true:
		 * 				   i. print: value found in given array at position + (element position)
		 * 				7. else:
		 * 				   i. print: value not found in a given array
		 * 				8. stop
		 * 
		 * Input/Output:
		 * 				Case 1:
		 * 				o/p: Enter the value
		 * 				i/p: 45
		 * 				o/p: 45 found in given array at position 4
		 * 
		 * 				Case 2:
		 * 				o/p: Enter the value
		 * 				i/p: 100
		 * 				o/p: value not found in given array
		 */
		
	/*----------------------------------------PROGRAM----------------------------------------*/
		
		Scanner scan = new Scanner(System.in);
		
//		2. declare array int ar[] = {1, 56, 98, 36, 45, 12, 95};
		int ar[] = {1, 56, 98, 36, 45, 12, 95};
//		3. declare a boolean which will store the status true if value found and initiate the position int
		boolean status = false;
		int position = 0;
		
//		4. ask the value from the user which have to Search in an given array
		System.out.println("Enter the value");
		int value = scan.nextInt();
		
//		5. initiate for loop start with 0 and end at ar.lenght
		for (int i = 0; i < ar.length; i++) {
//			a. if (ar[i] == user input):
			if (value == ar[i]) {
//				i. status = true
				status = true;
//				ii. store i in position variable
				position = i;
//				iii. break the loop
				break;
			}
		}
		
//		6. check the status if true:
		if (status) {
//			i. print: value found in given array at position + (element position)
			System.out.println(value + " found in given array at position " + position);
		}
//		7. else:
		else {
//			i. print: value not found in a given array
			System.out.println("value not found in a given array");
		}
		
		scan.close();						// this will close the scanner

	}

}
