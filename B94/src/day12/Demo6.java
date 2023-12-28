package day12;

import java.util.Scanner;

public class Demo6 {
//print multiplication table of a given number
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter a +ve number");
		int num=sc.nextInt();
		sc.close();

	
		for(int i=1;i<=10;i++)
		{
			int res=num*i;
			System.out.println(num+" * "+i+" = "+res);
		}
	}

}
