package day17;
//write a method which finds the factorial of a given number
public class Demo5 {

	public static int factorial(int number)
	{
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact*=i;
		}
		
		return fact;
	}
	public static void main(String[] args) {
		
		int r=Demo5.factorial(3);
		System.out.println(r);
		
		System.out.println(Demo5.factorial(5));
	}

}
