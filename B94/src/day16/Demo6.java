package day16;

public class Demo6 {
//what is the return type of main method & what it means?
//	return type of main method is 'void' which indicates that main method
//	does not return any value to the caller (JVM)
//	can i write return statement in main method?
//	yes but it must empty return statement
	public static void m1()
	{
		System.out.println("Hi");
		return;//empty return statement-user defined
//		System.out.println("Bye");//Unreachable code
	}
	
	public static void m2()
	{
		System.out.println("Hi");
		//we get empty return statement by compiler
	}
	public static void main(String[] args) {
		
		Demo6.m1();
		Demo6.m2();
		return;
	}

}
