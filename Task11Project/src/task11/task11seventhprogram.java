package task11;

import java.util.Scanner;

public class task11seventhprogram {

	public static void main(String[] args) {
        try {
            Scanner scn= new Scanner(System.in);
            int age= scn.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above.");
            } else {
                System.out.println("Valid age entered: " + age);
            }
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

}
