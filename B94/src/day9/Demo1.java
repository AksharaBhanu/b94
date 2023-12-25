package day9;

public class Demo1 {

	public static void main(String[] args) {
		
		int k=10;//what is the scope of this variable ?---> from line 7 till line 25-with in main method
		
		for(int i=1;i<=3;i++)	//i is local to 1st for loop - line 9 to line 14
		{
			System.out.println("GM");//print GM 3 times
			System.out.println(k);
			System.out.println(i);
		}
		
//		System.out.println(i);
		
		for(int j=1;j>=3;j++)
		{
			System.out.println("Bye");
			System.out.println(k);
		}

		System.out.println(k);
	}

}
