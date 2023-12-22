package day8;

public class Demo6 {

	public static void main(String[] args) {

		char gender='F';  //M F
		int age=32;
		
		if((gender=='M' && age>=21)||(gender=='F' && age>=18) )
		{
			
				System.out.println("You can marry");
			
		}
		else 
		{
				System.out.println("You can't marry");
		}
		

	}

}
