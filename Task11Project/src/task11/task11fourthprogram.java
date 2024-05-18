package task11;

import java.util.Scanner;

public class task11fourthprogram {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int num1= scn.nextInt();
		int num2= scn.nextInt();
		try {
            int result = num1 / num2;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed. Please enter a non-zero second integer.");
        }
		

	}

}
