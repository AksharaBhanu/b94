package day8;

import java.util.Scanner;

public class Demo3 {
//convert this into if condition
	public static void main(String[] args) {
		
		System.out.println("Please enter the month(1-12):");
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		sc.close();
		System.out.println("You have entered the month as:"+month);
		
		if(month==1 || month==2 || month==3)
		{
			System.out.println("Quarter-1");

		}
		else if(month>=4 && month<=6)
		{
			System.out.println("Quarter-2");

		}
		else if(month>=7 && month<=9)
		{
			System.out.println("Quarter-3");

		}
		else if(month>=10 && month<=12)
		{
			System.out.println("Quarter-4");
		}
		else
		{
			System.out.println("Invalid input");
		}

	}

}
