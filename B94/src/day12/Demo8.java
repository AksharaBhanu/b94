package day12;

import java.util.Scanner;

public class Demo8 {
//check if the given number is prime number or not
// it must be a natural number 1 2 3 4 ....  (0 -5 3.4 are not natural numbers)
// it must be exactly divisible by 2 numbers 
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter a natural number(int which 1 and above)");
		int num=sc.nextInt();
		sc.close();
		String msg="it is a prime number";
		
		if(num==1)
		{
			System.out.println("Not a prime number");
		}
		else if(num==2)
		{
			System.out.println("it is a prime number");
		}
		else 
		{
			for(int i=2;i<num;i++)
			{
				if(num % i == 0)
				{
					msg="Not a prime number";
					break;
				}
			}
			
			System.out.println(msg);
		}
		
		
	}
}
