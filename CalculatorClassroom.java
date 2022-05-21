package week1.day2;

public class CalculatorClassroom {

	public void add(int num1, int num2) 
	{
		System.out.println(num1 + num2);
	}

	public void subract(double num1, double num2) 
	{
		System.out.println(num1 - num2);
	}

	public void multiply(double num1, double num2) 
	{
		System.out.println(num1 * num2);
	}

	public void divide(float num1, float num2) 
	{
		System.out.println(num1 / num2);
	}

	public static void main(String[] args) 
	{
		CalculatorClassroom Cals = new CalculatorClassroom();
		Cals.add(2, 3);
		Cals.subract(12.34, 2.34);
		Cals.multiply(45.6, 6.78);
		Cals.divide(10, 3);

	}
}
