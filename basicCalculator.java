//Day 3 Write a program to read the user input using Scanner class
// Basic Calculator

package dayThree;

import java.util.Scanner;

public class basicCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the basic calculator!");
		System.out.println("Enter the first number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = scanner.nextInt();
		
		System.out.println("Enter the operation: + or - or * or / ");
		char operation = scanner.next().charAt(0);
		
		int result = 0;
		boolean validOperation = true;
		
		switch (operation){
		 case '+' :
		    result = num1 + num2;
		 	break;
		 case '-' :
			 result = num1 - num2;
			 break;
		 case '*':
			 result = num1 * num2;
			 break;
		 case '/':
			 result = num1 / num2;
			 break;
		default:
			 validOperation = false;
			 break;
		} 
		
		
		if (validOperation) {
			System.out.println("The result of " + num1 + " " + operation + " " + num2 +
					" is " + result +". Thank you for using the basic calculator." );
		}
		scanner.close();
		
	}

}
