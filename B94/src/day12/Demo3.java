package day12;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		//accept the number from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter a number");
		int num=sc.nextInt();
		sc.close();
		
		if(num %2 == 0)
		{
			System.out.println("The number:" + num + " is an even number");
		}
		else
		{
			System.out.println("The number:" + num + " is an odd number");
		}
	}
}
