package day12;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		//accept the number from the user and print its sum
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter a +ve number");
		int num=sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		
		System.out.println("Sum of 1 to " + num + " is "+sum);
	}
}
