package day13;

public class Demo4 {

	public static void main(String[] args) {
		
		boolean isPrime=true;
		
		int n=0;//add scanner class
		
		if(n<=0)
		{
			System.out.println("invalid input");
			return;//exit from the method
		}
		
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
