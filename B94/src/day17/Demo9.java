package day17;

/*m1(0)-->The End
 *m1(1)--> 
 */
public class Demo9 {
	public static void m1(int n)
	{
		if(n<=0)
		{
			System.out.println("The End");
		}
		else
		{
			System.out.println(n);
			n--;
			m1(n);
		}
	
	}
	
	public static void main(String[] args)
	{
		m1(10);
	}

}
