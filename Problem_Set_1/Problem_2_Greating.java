package Problem_Set_1;

import java.util.Scanner;

public class Problem_2_Greating {

	public static void main(String[] args) {
		
		/*
		 * write a program which ask user to enter his/her name and greets them with "Hello <name>, hava a good day" text.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = scan.nextLine();
		
		System.out.println("Hello " + name +", hava a good day.");
		
		
	}

}
