package day17;
//Home work: Dev recursive method to find sum of n numbers
public class Demo14 {
	public static int factorial(int n)
	{
		int fact=1;
		
		if(n>1)
		{
			fact=n*factorial(n-1);
		}
		
		return fact;
	}
	
	public static void main(String[] args)
	{
		int res = factorial(6);
		System.out.println(res);
	}

}
