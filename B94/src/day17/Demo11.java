package day17;

/*m1(0)--> The End
 *m1(1)--> The End 1
 *m1(2)--> The End 1 2
 *m1(3)--> The End 1 2 3 
 * 
 */
public class Demo11 {
	public static void m1(int n)
	{
		if(n<=0)
		{
			System.out.println("The End");
			return;//exit from the method
		}
		else
		{
			int p=n;
			n--;
			m1(n);
			System.out.println(p);
			return;
		}
	
	}
	
	public static void main(String[] args)
	{
		m1(10);

	}

}
