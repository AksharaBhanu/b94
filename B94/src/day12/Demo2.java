package day12;

import java.util.Scanner;

public class Demo2 {
	//accept 2 numbers from user and print the largest number
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Plz enter a number N1");
			int n1=sc.nextInt();
			System.out.println("Plz enter another number N2");
			int n2=sc.nextInt();
			sc.close();
			
			if(n1>n2)
			{
				System.out.println("N1:"+n1+" is the largest number");
			}
			else if(n2>n1)
			{
				System.out.println("N2: "+n2+" is the largest number");
			}
			else
			{
				System.out.println("N1:"+n1+" and N2:"+n2+" are equal");
			}

		}

}
