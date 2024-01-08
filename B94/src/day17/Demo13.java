package day17;
/*factorial(1)-->1
 * factorial(2)-->2
 *  factorial(3)->6
 * factorial(3)-->24
 */
public class Demo13 {
	public static int factorial(int n)
	{
		int fact=1;
		
		if(n<=1)
		{
			fact=1;
		}
		else
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
