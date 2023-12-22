package day8;

import java.util.Scanner;

public class Demo4 {
//0-34-Fail  35 to 59-PS 60 74-PF 75-100-FD -invalid
	public static void main(String[] args) {
		
		System.out.println("Please enter the marksh(0-100):");
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		
	
		sc.close();
		
		if(marks>=0 && marks<=34)
		{
			System.out.println("Fail");
		}
		else if(marks>=35 && marks<=59)
		{
			System.out.println("Pass");
		}
		else if(marks>=60 && marks<=74)
		{
			System.out.println("First class");
		}
		else if(marks>=75 && marks<=100)
		{
			System.out.println("FCD");
		}
		else
		{
			System.out.println("Invalid input");
		}
	}

}
