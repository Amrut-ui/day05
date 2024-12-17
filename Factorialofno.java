package day05;
import java.util.Scanner;
public class Factorialofno {




	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a non-negative integer: ");
	        int num = scanner.nextInt();

	        if (num < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	        } else {
	            long factorial = 1; // Using long to handle larger factorials

	            for (int i = 1; i <= num; i++) {
	                factorial *= i;
	            }

	            System.out.println("Factorial of " + num + " = " + factorial);
	        }

	        scanner.close();
	    }
	
	}


