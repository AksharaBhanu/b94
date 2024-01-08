package day17;

public class Demo8 {
/*m1(0);--> The End
 *m1(1);--> 1 The End
 *m1(2);--> 2 1 The End 
 *m1(3);--> 3 2 1 The End  
 *m1(10);-->10 9 8 7 6 5 4 3 2 1 The End 
 */
	public static void m1(int n)
	{
		if(n<=0)
		{
			System.out.println("The End");
			return;//exit from the method
		}
		else
		{
			System.out.println(n);
			n--;
			m1(n);
			return;
		}
	
	}
	
	public static void main(String[] args)
	{
		m1(10);

	}

}
