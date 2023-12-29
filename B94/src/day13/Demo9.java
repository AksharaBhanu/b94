package day13;

import java.util.Scanner;

/* accept 2 numbers from user and display its sum -keep doing this till user says stop 
 * 
 * 
 * 
 */
public class Demo9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("Please enter a number");
			int n1=sc.nextInt();
			
			System.out.println("Please enter another number");
			int n2=sc.nextInt();
			
			int sum=n1+n2;
			System.out.println("Sum is:"+sum);
			
			System.out.println("Stop? 1.Yes 2.No");
			choice=sc.nextInt();
		}
		while(choice==2);
		
		System.out.println("Thank You");
		
		sc.close();
	}
}
