package day12;

import java.util.Scanner;

public class Demo5 {
//find the factorial of a given number
//print the factorial of number given by the user
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter a +ve number");
		int num=sc.nextInt();
		sc.close();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Fact of " + num + " is "+fact);
	}

}
