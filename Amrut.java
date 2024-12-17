package day05;
import java.util.Scanner;

public class Amrut {

	

	public class PowerCalculation {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the base: ");
	        int base = scanner.nextInt();

	        System.out.print("Enter the index: ");
	        int index = scanner.nextInt();

	        int power = 1;

	        for (int i = 1; i <= index; i++) {
	            power *= base;
	        }

	        System.out.println(base + "^" + index + " = " + power);

	        scanner.close();
	    }
	}

	}


