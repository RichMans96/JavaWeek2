package scanner;

import java.util.Scanner;

public class Calculator {

	private double add(double num1, double num2) {
		return num1 + num2;
	}

	private double subtract(double num1, double num2) {
		return num1 - num2;
	}

	private double divide(double num1, double num2) {
		if (num2 == 0) {
			return 0;
		}
		return num1 / num2;
	}

	private double multiply(double num1, double num2) {
		return num1 * num2;
	}

	// kinda broken, fix later
	public void userInput() {
		Scanner scan = new Scanner(System.in);
		boolean running = true;

		do {
			System.out.println("What do you want to do? (+, *, -, /)");
			String userOperation = scan.nextLine();
			

			System.out.println("Enter the first number: ");
			double num1 = scan.nextDouble();
			System.out.println("Enter the second number: ");
			double num2 = scan.nextDouble();

			switch (userOperation) {
			case "+":
				System.out.println(add(num1, num2));
				break;
			case "-":
				System.out.println(subtract(num1, num2));
				break;
			case "/":
				System.out.println(divide(num1, num2));
				break;
			case "*":
				System.out.println(multiply(num1, num2));
				break;
			case "Exit":
				running = false;
				break;
			default:
				System.out.println("i don't know what that is");
				break;
			}

		} while (running);

		scan.close();
	}
}
