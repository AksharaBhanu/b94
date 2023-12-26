package day10;

public class Demo12 {

	// * * * * *
	// * * * *
	// * * *
	// * *
	// *
	public static void main(String[] args) {
	//java code to print triangle pattern
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
