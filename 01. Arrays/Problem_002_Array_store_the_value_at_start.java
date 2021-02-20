
public class Problem_002_Array_store_the_value_at_start {

	public static void main(String[] args) {
		
		/* 
		 * Task:
		 * 				Store the value at the 0th element at an array
		 * 				ar[] = 1, 56, 98, 36, 45, 12, 95
		 * 				put ar[0] = 70
		 * 
		 * Solution/Algo:
		 * 				1. start
		 * 				2. declare array int ar[] = {1, 56, 98, 36, 45, 12, 95};
		 * 				3. declare variable which we have to store at 0th position int val = 70;
		 * 				4. initiate for loop start with ar.length-1 and end at >0
		 * 				   a. store value of i-1 element at i element position in a loop
		 * 				   b. ex: ar[i] = ar[i-1];
		 * 				5. store the given value at 0th position in array
		 * 				6. ex: ar[0] = val;
		 * 				7. stop
		 * 				
		 * Input/Output:
		 * 				i/p: 1 56 98 36 45 12 95 
		 * 				o/p: 70 1 56 98 36 45 12 
		 */
		
	/*----------------------------------------PROGRAM----------------------------------------*/
		
		
//		2. declare array int ar[] = {1, 56, 98, 36, 45, 12, 95};
		int[] ar = {1, 56, 98, 36, 45, 12, 95};
		
//		3. declear variable which we have to store at 0th position int val = 70;
		int val = 70;
		
//		this for loop is to print before operation values
		System.out.print("i/p: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();					// this is to seperate the input and output print
		
//		4. initiate for loop start with ar.length-1 and end at >0
		for (int i = ar.length - 1; i > 0; i--) {
//			a. store value of last second element at last element position in a loop
			ar[i] = ar[i-1];
		}
		
//		5. store the given value at 0th position in array
		ar[0] = val;
		
//		this for loop is to print after operation values
		System.out.print("o/p: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		
		
	}

}
