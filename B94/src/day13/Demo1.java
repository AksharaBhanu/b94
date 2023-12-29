package day13;

public class Demo1 {
/*what is prime number
 * 1. natural number 
 *    a. complete number from 1
 *    b. not a natural number 0 , any -ve number , any number with decimal points 10.45
 *    
 * 2. should be divisible exactly by 2 numbers
 *     a. every natural number is divisible by 1
 *     b. every natural number is divisible by it self
 *     c. so prime number it should not be divisible by any other number (1 & itself)
 *     d. how to prove this?
 *        divide it by every other number (other than 1 & itself) and check that reminder is not zero
 *        what is every other number ? 2 3 4... n-1 
 *     e. every natural number is not divisible by any number which is greater than the  natural number
 */
	public static void main(String[] args) {
		
		boolean isPrime=true;//it is a prime number
		int n=2;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				isPrime=false;//it is NOT a prime number
				break;
			}
		}
	
		if(isPrime)
		{
			System.out.println("It is a prime number");
		}
		else
		{
			System.out.println("Is is NOT a prime number");
		}
	}

}
