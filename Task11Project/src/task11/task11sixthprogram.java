package task11;

import java.util.Scanner;

public class task11sixthprogram {

	public static void main(String[] args) {
		String username = "admin";
        String password = "password123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        try {
            if (!username.equals(inputUsername) || !password.equals(inputPassword)) {
                throw new Exception("Incorrect username or password. Please try again.");
            } else {
                System.out.println("Login successful!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


	}

