package day9;

public class Demo7 {

	public static void main(String[] args) {
		System.out.println("Start1");
		
		for(int i=1;i<=3;i++)
		{
			System.out.println("Hi1");
		}
		
		System.out.println("End1");
		
		
		
		System.out.println("Start2");
		
		for(int i=1;i<=3;i++);
		{
			
			System.out.println("Hi2");//this is not the body of the for loop
		}
		
		System.out.println("End2");

	}

}
