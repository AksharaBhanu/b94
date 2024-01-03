package day15;

public class Demo8 {
	//jagged array--> each row has diff number columns
	public static void main(String[] args) {
		
		String[][] a= {{"A1","B1","C1"},{"A2","B2"},{"A3","B3","C3","D3"}};
		
		
		for(String[] b:a)
		{
			for(String c:b)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
		System.out.println("-------");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
