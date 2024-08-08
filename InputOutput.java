//Day 3 - Input and Output
//1. Write a program that reads user input and print it to the console.

package dayThree;
import java.util.Scanner;
public class InputOutput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your full name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		
		System.out.println("Enter your house name");
		String house = scanner.next();
		
		System.out.println("Enter the previous salary: ");
		short previousSalary = scanner.nextShort();
		
		System.out.println("Enter the salary expectation: ");
		double salaryExpectation = scanner.nextDouble();
		
		System.out.println("Enter the rent amount: ");
	    float rentAmount = scanner.nextFloat();
	    
		System.out.println("Enter the National Identity Number : ");
		long id = scanner.nextLong();
		
		System.out.println("Enter a rate for the software between 0-5: ");
		byte rate = scanner.nextByte();
		
		System.out.println("This is your first job: true/false");
		boolean firstJob = scanner.nextBoolean();
		
		System.out.println("Thank you for your answers. Please wait.");
		
		System.out.println("Your name is " + name + " and you are "+ age + " years old. You belong to " + house + " house.  Your previous salary is " 
		+ previousSalary + " and the current salary expectation is " + salaryExpectation + " The monthly rent amouts to "+ rentAmount 
		+ ". The national ID is " + id + ". Your rating for the software is " + rate + ". It is " + firstJob + " that this is your first job.");
		scanner.close();
		}

}
