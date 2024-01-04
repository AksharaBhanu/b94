package day16;

public class Demo1 {
	//creating the method m1
		//define the method--> writing header and body for a method
		public static void m1()
		{
			System.out.println("Hi");
			System.out.println("Bye");
		}
		
	//javac Demo1.java--compile->Demo1.class
	//java Demo1 --> JRE--> JVM--> main method
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Demo1.m1();//calling the method -->ClassName.methodName();
		Demo1.m1();
		System.out.println("Main Ends");
	}
	

	
}
