
public class Calculator 
{
	public static int add(int firstNum, int secondNum)
	{
		return firstNum + secondNum;
	}
	
	public static int subtract(int firstNum, int secondNum)
	{
		return firstNum - secondNum;
	}
	
	public static int multiply(int firstNum, int secondNum)
	{
		return firstNum * secondNum;
	}
	
	public static int divide(int firstNum, int secondNum)
	{
		return firstNum / secondNum;
	}
	
	public static int square(int number)
	{
		return number * number;
	}

	public static void main(String [] args)
	{
		System.out.println(add(1,2));
		System.out.println(subtract(3,1));
		System.out.println(multiply(3,4));
		System.out.println(divide(6,3));
		System.out.println(square(4));
	}
}
