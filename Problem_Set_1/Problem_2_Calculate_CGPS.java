package Problem_Set_1;

import java.util.Scanner;

public class Problem_2_Calculate_CGPS {

	public static void main(String[] args) {
		
		/*
		 * Write a program to calculate the CGPA using marks of three subjects (out of 100).
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter mark of first subject out of 100");
		float mark1 = scan.nextFloat();
		
		System.out.println("Enter mark of second subject out of 100");
		float mark2 = scan.nextFloat();
		
		System.out.println("Enter mark of third subject out of 100");
		float mark3 = scan.nextFloat();
		
		float cgpa = (mark1 + mark2 + mark3)/3;		// marks * 100 / 300 == marks  3
		
		System.out.println("CGPA is " + cgpa);
		
		
		
	}

}
