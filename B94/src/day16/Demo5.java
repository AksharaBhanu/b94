package day16;

public class Demo5 {
//void m1 --> indicates that the method m1 will not return any value to the caller
//int m1-->indicates that the method m1 will return a value of type int to the caller
	public static void tax_to_gov(int money)
	{
		System.out.println("Thanks for paying tax:"+money);
	}
	
	public static int deposit_to_bank(int money)
	{
		int amount=money+100;
		return amount;
	}
	
	public static String shop(int howmany)
	{
		String fruit="";
		for(int i=1;i<=howmany;i++)
		{
			fruit=fruit+"Apple ";
			break;
		}
		
		return fruit;
	}
	
	public static void main(String[] args)
	{
		Demo5.tax_to_gov(1000);
		
		int amt=Demo5.deposit_to_bank(1000);
		System.out.println(amt);
		
		String basket = Demo5.shop(3);
		System.out.println(basket);
	}

}
