package Problem_Set_1;

import java.util.Scanner;

public class Problem_5_Integer_or_not {

	public static void main(String[] args) {
		
		/*
		 * Write a program to find the entered number is integer or not.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number");
		
        System.out.println(scan.hasNextInt());		// here .hasNextInt() returns boolean value weather the number is integer or not
		
		
	}

}
