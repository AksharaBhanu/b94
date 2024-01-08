package day17;
/*m1(0)-->stops
 *m1(1)--> 1 stops 
 * 
 * 
 */
//print 10 to 1 without using any looping statement
public class Demo10 {
	public static void m1(int n)
	{
		if(n>0)
		{
			System.out.println(n--);
			m1(n);
		}
	}
	
	public static void main(String[] args)
	{

		m1(10);
	}

}
