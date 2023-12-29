package day13;

public class Demo5 {

	public static void main(String[] args) {
		int n=1237;
		
		int i=n%10;//get last digit
		
		System.out.println(n);//1237
		System.out.println(i);//7
		
		n=n/10;//deleting last digit
		System.out.println(n);//123
		
		

	}

}
