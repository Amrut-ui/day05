package day05;
import java.util.Scanner;

public class Sumofdigits1to10 {

	

	public class SumOfDigits {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();

	        int sum = 0;
	        while (num > 0) {
	            int digit = num % 10;
	            sum += digit;
	            num /= 10;
	        }

	        System.out.println("Sum of digits: " + sum);

	        scanner.close();
	    }
	}

	}


