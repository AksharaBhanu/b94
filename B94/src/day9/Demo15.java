package day9;

public class Demo15 {

	public static void main(String[] args) {
		//print 10 8 6 4 2	hint: decrement the i value by 2
		for(int i=10;i>0;i=i-2)
		{
			System.out.println(i);
		}
	
		for(int i=10;i>0;i-=2)
		{
			System.out.println(i);
		}
	
		for(int i=10;i>0;i--)
		{
			System.out.println(i);
			i--;
		}
		
		for(int i=10;i>0;i--,i--)
		{
			System.out.println(i);
		}
		
	}

}
