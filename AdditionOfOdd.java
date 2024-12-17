package day05;

public class AdditionOfOdd {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(i<=10) {
			sum+=i;
			i+=2;
		}
		System.out.println("the addition of odd numbers is:" + sum);

	}

}
