package day13;

public class Demo3 {

	public static void main(String[] args) {
		
		boolean isPrime=true;
		
		int n=1;
		
		if(n<=0)
		{
			System.out.println("invalid input");
		}
		else
		{
			if(n==1)
			{
				isPrime=false;
			}
			else 
			{
				for(int i=2;i<n;i++)
				{
					if(n%i==0)
					{
						isPrime=false;
						break;
					}
				}
			}
			System.out.println(isPrime? "It is a Prime Number" : "It is Not a Prime Number" );
		}
	}

}
