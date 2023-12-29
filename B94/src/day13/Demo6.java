package day13;

public class Demo6 {

	public static void main(String[] args) {
		int number;
		int lastDigit;
		
		number=6791;
		lastDigit=number%10;//get last digit
		System.out.println(lastDigit);//1
		
		number=number/10;// remove last digit
		lastDigit=number%10;
		System.out.println(lastDigit);//9
		
		number=number/10;//12
		lastDigit=number%10;
		System.out.println(lastDigit);//7
		
		number=number/10;//1
		lastDigit=number%10;
		System.out.println(lastDigit);//6
		
		number=number/10;//0   //stop this when number is zero
		lastDigit=number%10;
		System.out.println(lastDigit);
		
		number=number/10;//0
		lastDigit=number%10;
		System.out.println(lastDigit);

	}
}
