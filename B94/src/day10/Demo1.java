package day10;

public class Demo1 {

	public static void main(String[] args) {
		// print 1 to 10 using for loop
		
		for(int i=1;i<=10;i++)
		{
			if(i>=4 && i<=7)
			{
				continue;//it will skip remaining code and goto next iteration
			}
			System.out.println(i);
		}
		
		
	}

}
