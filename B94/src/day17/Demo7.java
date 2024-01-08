package day17;
/*
 * in this example 
 * both main method and m1 method are present in same class
 * both main method and m1 method are static method
 * then we can call m1() directly (without using class name) in main method
 * 
 */
public class Demo7 {

	public static void m1()
	{
		System.out.println("Hi");
	}
	
	public static void main(String[] args)
	{
		Demo7.m1();
		m1();

	}

}
