package day12;

import java.util.Scanner;

public class Demo9 {
//check if the given number is prime number or not
// it must be a natural number 1 2 3 4 ....  (0 -5 3.4 are not natural numbers)
// it must be exactly divisible by 2 numbers 
	
	public static void main(String[] args) {
		
		for(int num=1;num<=10;num++)
		{
				String msg=" is a prime number";
				
				if(num==1)
				{
					System.out.println(num+" is not a prime number");
				}
				else if(num==2)
				{
					System.out.println(num+" is a prime number");
				}
				else 
				{
					for(int i=2;i<num;i++)
					{
						if(num % i == 0)
						{
							msg=" is not a prime number";
							break;
						}
					}
					
					System.out.println(num+msg);
				}
				
		}
	}
}
