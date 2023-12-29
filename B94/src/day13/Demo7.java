package day13;

public class Demo7 {
//print all the digits present in given number in reverse order
//reverse the given number
	public static void main(String[] args) {
		int number=123;
		int lastDigit;
		
		while(number>0)
		{
			lastDigit=number%10;
			System.out.print(lastDigit);
			number=number/10;
		}
	}

}
