package day17;

public class Demo12 {
	public static void m1(int n)
	{
		if(n>0)
		{
			int p=n;
			n--;
			m1(n);
			System.out.println(p);
		}
	}
	
	public static void main(String[] args)
	{
		m1(10);

	}

}
