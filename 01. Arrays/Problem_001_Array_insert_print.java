import java.util.Scanner;

public class Problem_001_Array_insert_print {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter length of array");
		int array_length = scan.nextInt();				// to set the length of the array
		
		int[] ar = new int[array_length];				// created an array of length array_length

		
//		for loop to store the values in array
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Enter " + i + " element of an array");
			ar[i] = scan.nextInt();			// taking input from user and store into array at i location
		}

		System.out.print("Output: ");
		
//		for loop to print the values of array
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");	// this will print the array at i location
		}
		
		scan.close();						// this will close the scanner
	}

}
