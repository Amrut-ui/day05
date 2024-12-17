package day05;

public class Prime1to10 {

	
	    public static void main(String[] args) {
	        for (int num = 101; num <= 150; num++) {
	            boolean isPrime = true;
	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	                System.out.print(num + " ");
	            }
	        }
	    }
	

	}


