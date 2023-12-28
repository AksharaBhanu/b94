package day12;

import java.util.Scanner;

public class Demo7 {
//correct PIN is 123
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		for(int i=1;i<=3;i++)
		{	
			
			System.out.println("Plz enter your ATM PIN");
			int pin=sc.nextInt();
			
			if(pin==123)
			{
				System.out.println("Welcome to UCUC bank");
				break;
			}
			else if(i==3)
			{
				System.out.println("Ur Card is blocked");
			}
			else
			{
				System.out.println("invalid pin, plz try again");
			}
			
		}
		
		sc.close();

	}

}
