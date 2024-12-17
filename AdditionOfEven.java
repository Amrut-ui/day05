package day05;

public class AdditionOfEven {

	public static void main(String[] args) {
		int number = 2;
		int sum = 0;
		while(number<=10) {
			sum+=number;
			number+=2;
		}
		System.out.println("the addition of even numbers is:"+sum);

	}

}
