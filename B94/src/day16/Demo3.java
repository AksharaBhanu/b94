package day16;

public class Demo3 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		Demo3.m1();
		System.out.println("Main Ends");

	}
	public static void m1() 
	{
		System.out.println("M1 Starts");
		Demo3.m1();//StackOverFlowError
		System.out.println("M1 Ends");
	}
}
