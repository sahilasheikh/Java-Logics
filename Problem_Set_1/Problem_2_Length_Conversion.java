package Problem_Set_1;

import java.util.Scanner;

public class Problem_2_Length_Conversion {

	public static void main(String[] args) {
		
		/*
		 * Write a program to convert the kilometer into miles.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter length in Kilometers");
		float km = scan.nextFloat();
		
		float miles = 0.621371f * km;	// 0.621371 miles == 1 kilometer
		
		System.out.println(km + " Kilometers is equal to " + miles + " miles");
		
	}

}
