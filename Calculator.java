import java.util.Scanner;

public class Calculator {
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
		
		
		// Non primitive data types AKA reference types
		// reference types start with a capital letter
		
	 
	int userNum;	 

	System.out.println("Enter a number:\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit");
	userNum = scan.nextInt();	

		
	if(userNum == 5) {
		System.out.println("Program exited");
		System.exit(0);
	} else if(userNum > 5 || userNum < 1) {
		System.out.println("Invalid Entry, Try Again");
		System.exit(0);
	}
	
	
	System.out.println("Enter your first number:");
	double num1 = scan.nextDouble();
	System.out.println("Enter your second number:");
	double num2 = scan.nextDouble();
	
	
	switch(userNum) {
		case 1:
			System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
			break;
		case 2:
			System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
			break;
		case 3:
			System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
			break;
		case 4:
			System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
			break;
		default:
			System.out.println("Error, Please Try Again.");
			break;
	}
	
	
	
	}
	
	
	
	public static double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double subtract(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double divide(double num1, double num2) {
		return num1 / num2;
	}
	
	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}

}