package day16;

public class Demo4 {
//argument is also called as parameter
//x & y are parameters , p &q are arguments value or variable
	public static void add_number(int x,int y)//argument of the method (input for the method)
	{
		
		int i=x;
		int j=y;
		int sum=i+j;
		System.out.println("Sum is:"+sum);
	
	}
	
	public static void main(String[] args) {
		Demo4.add_number(1,2);
		Demo4.add_number(10,20);
		
		int p=20,q=30;
		Demo4.add_number(p,q);
	}
	
	public static void add_number2(int x,int y)
	{
		int sum=x+y;
		System.out.println("Sum is:"+sum);
	}

}
