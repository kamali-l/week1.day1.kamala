package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 153;
		int value = input;
		
		int sum = 0;

		while (input > 0) {
			int rem = input % 10;
			sum = sum + (rem * rem * rem);
			input = input / 10;
			
		}
		
		if (value == sum) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
		

	}

}


