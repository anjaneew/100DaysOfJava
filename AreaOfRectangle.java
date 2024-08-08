//Day 4 - Basic Arithmetic Operations
//Write a program that calculates the area of a rectangle. 
//Prompt the user to input the length(integer) and width(integer) of the rectangle, 
//calculate the area (length * width), and print the result.

package dayThree;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the length in cm: ");
		double length = scanner.nextDouble();
		System.out.println("Please enter the width in cm: ");
		double width = scanner.nextDouble();
        
		calculateRectangle(length, width);
		calculateTriangle(length, width);
		
		scanner.close();
	}
	
	public static void calculateRectangle(double length, double width) {
		double areaOfRectangle = length * width ;
		System.out.printf("The area of the rectangle is %.2f cm².", areaOfRectangle);
	}
	
	public static void calculateTriangle(double length, double width) {
		double areaOfTriangle =  (length * width) / 2 ;
		System.out.printf("%n The area of the triangle is %.2f cm².", areaOfTriangle);
	}
}
