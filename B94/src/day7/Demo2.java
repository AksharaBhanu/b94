package day7;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println("Please enter a number:");
		Scanner sc=new Scanner(System.in);//creating object of Scanner class
		int n=sc.nextInt();
		sc.close();
		System.out.println("ur input is:"+n);
	}
}
