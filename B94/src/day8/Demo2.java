package day8;

import java.util.Scanner;

public class Demo2 {
//accept the month number 1 2 ---12 & print the respective Q name --> Q1 Q2 Q3 Q4---> switch
// 1 2 3 --> Q1   4 5 6-Q2  7 8 9-Q3  10 11 12=Q4
	public static void main(String[] args) {
		
		System.out.println("Please enter the month(1-12):");
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		sc.close();
		System.out.println("You have entered the month as:"+month);
		
		switch(month)
		{
			case 1:

			case 2:
				
			case 3:
					System.out.println("Quarter-1");
					break;
					
			case 4:

			case 5:
				
			case 6:
					System.out.println("Quarter-2");
					break;
					
			case 7:

			case 8:
				
			case 9:
					System.out.println("Quarter-3");
					break;
					
			case 10:

			case 11:
				
			case 12:
					System.out.println("Quarter-4");
					break;
			default:
					System.out.println("invalid input");
		}
		

	}

}
