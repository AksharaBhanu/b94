package day12;

import java.util.Scanner;

public class Demo1 {
	//accept the age from the user and inform whether he/she can vote
		public static void main(String[] args) {
			//ask for age
			Scanner sc=new Scanner(System.in);
			System.out.println("Plz enter ur age:");
			int age=sc.nextInt();
			sc.close();
			//check if age is >=18 --> u can vote
			if(age>=18)
			{
				System.out.println("You can vote");
			}
			else		//else - u cant vote
			{
				System.out.println("You can't vote");
			}
			

		}


}
