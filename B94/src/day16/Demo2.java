package day16;

public class Demo2 {
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		Demo2.m1();
		Demo2.m2();
		System.out.println("Main Ends");
	}
	
	public static void m1() 
	{
		System.out.println("M1 Starts");
		Demo2.m2();
		System.out.println("M1 Ends");
	}
	
	public static void m2() 
	{
		System.out.println("M2 Starts");
		System.out.println("Hi");
		System.out.println("M2 Ends");
	}
}
