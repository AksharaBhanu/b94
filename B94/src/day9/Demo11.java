package day9;

public class Demo11 {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);//1 to 10
		}
		System.out.println("---");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);// 1
			break;
		}
		
		
		System.out.println("---");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);//1 to 5
			if(i>4)
			{
				break;
			}
		}

	}

}
