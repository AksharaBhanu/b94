package day8;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the gender:(M/F)");
		char gender=sc.next().charAt(0);; //accept a char using scanner
		System.out.println("please enter the age");
		int age=sc.nextInt();
		sc.close();
		
		if(gender=='m')
		{
			if(age>=21)							//nested condition
			{
				System.out.println("Hi Boy, You can marry ");
			}
			else
			{
				System.out.println("Hi Boy sorry You can't marry");
			}
		}
		else if(gender=='f')
		{
			if(age>=18)
			{
				System.out.println("Hi Girl, You can marry");
			}
			else
			{
				System.out.println("Hi Girl,sorry You can't marry");
			}
		}
		else
		{
			System.out.println("Invalid input");
		}

	}

}
