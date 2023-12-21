package day7;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter number:");
		int number=sc.nextInt();
		sc.close();
		
		if(number>0)
		{
			System.out.println("It is a +ve number");
		}
		else
		{
			System.out.println("It is NOT a +ve number");
		}
		System.out.println("Thank you");
		

	}

}
