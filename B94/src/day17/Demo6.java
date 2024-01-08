package day17;
//write a method which will find out whether give number is prime or not
public class Demo6 {

	public static boolean isPrime(int number)
	{
		boolean isPrime=true;
		
		if(number==1)
		{
			isPrime=false;
		}
		else 
		{
			for(int i=2;i<number;i++)
			{
				if(number%i==0)
				{
					isPrime=false;
					break;
				}
			}
		}
		
		return isPrime;
	}
	
	public static void main(String[] args) {
		
		for(int k=1;k<=10;k++)
		{
			boolean res = Demo6.isPrime(k);
			System.out.println(k+ (res?" it is prime":" it is not prime"));
		}
		
		System.out.println("--------------------");
		for(int k=1;k<=10;k++)
		{
			if( Demo6.isPrime(k))
			{
				System.out.println(k);
			}
		}
	}

}
