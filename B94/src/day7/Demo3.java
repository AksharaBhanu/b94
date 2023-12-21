package day7;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Plz enter number1:");
		int a=sc.nextInt();
		
		System.out.println("Plz enter number2:");
		int b=sc.nextInt();
		
		sc.close();
		
		int sum=a+b;
		//Sum of 10 and 20 is 30
		System.out.println("Sum of "+a+" and "+b+" is "+sum);

	}

}
