import java.util.Scanner;

public class Problem_003_Array_store_value_at_n {
	
	public static void main(String[] args) {
		
		/* 
		 * Task:
		 * 				Store the value at the nth element at an array where n is the number of element which is taken by the user
		 * 				ar[] = 1, 56, 98, 36, 45, 12, 95
		 * 				put ar[n] = user input
		 * 
		 * Solution/Algo:
		 * 				1. start
		 * 				2. declare array int ar[] = {1, 56, 98, 36, 45, 12, 95};
		 * 				3. declare variable which we have to store at nth position int val = 70;
		 * 				4. ask the position of element (n) from user
		 * 				5. if the n is less then 0 OR more than ar.length:
		 * 				   i. print: n must be in between 0 to ar.length
		 * 				6. else:
		 * 				   i. initiate for loop start with ar.length-1 and end at >n
		 * 				      a. store value of i-1 element at i element position in a loop
		 * 				         ex: ar[i] = ar[i-1];
		 * 				   ii. store the given value at nth position in array
		 * 				      ex: ar[n] = val;
		 * 				8. stop
		 * 				
		 * Input/Output:
		 * 				i/p: 5
		 * 				o/p: 1 56 98 36 45 70 12 
		 */
		
	/*----------------------------------------PROGRAM----------------------------------------*/

		Scanner scan = new Scanner(System.in);
		
//		2. declare array int ar[] = {1, 56, 98, 36, 45, 12, 95};
		int[] ar = {1, 56, 98, 36, 45, 12, 95};
		
//		3. declare variable which we have to store at nth position int val = 70;
		int val = 70;
		
//		4. ask the position of element (n) from user
		System.out.println("enter the position of element (start with 0)");
		int n = scan.nextInt();
		int ar_length = ar.length;
		
//		5. if the n is less then 0 OR more than ar.length:
		if (n > ar_length-1 || n < 0) {
//			i. print: n must be in between 0 to ar.length
			System.out.println("n must be in between 0 to " + ar.length);
		}
		
//		6. else:
		else {
			
//			i. initiate for loop start with ar.length-1 and end at >n
			for (int i = ar.length-1; i > n; i--) {
				
//				a. store value of i-1 element at i element position in a loop
				ar[i] = ar[i-1];
				
			}
			
//			ii. store the given value at nth position in array
			ar[n] = val;
			
//			this for loop to print the array
			for (int i = 0; i < ar.length; i++) {
				System.out.print(ar[i] + " ");
			}
			
		}
		
		scan.close();						// this will close the scanner
		
	}
	
}
