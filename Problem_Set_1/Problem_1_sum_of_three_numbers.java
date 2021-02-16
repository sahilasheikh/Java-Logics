package Problem_Set_1;

import java.util.Scanner;

public class Problem_1_sum_of_three_numbers {

	public static void main(String[] args) {
		
		
		/*
		 *Write a program to calculate the sum of 3 numbers. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1 = scan.nextInt();
		
		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		
		System.out.println("Enter third number");
		int num3 = scan.nextInt();
		
		int sum = num1 + num2 + num3;
		
		System.out.println("Sum is " + sum);
		
		
	}

}
