package day13;

public class Demo8 {
//print sum of the digits present in given number
//input is 251--> then o/p 2+5+1 or 1 + 5 + 2=> 8
	public static void main(String[] args) {
		int number=251;
		int lastDigit=0;
		int sum=0;
		
		while(number>0)
		{
			lastDigit=number%10;
			sum=sum+lastDigit;
			number=number/10;
		}
		
		System.out.println(sum);

	}

}
