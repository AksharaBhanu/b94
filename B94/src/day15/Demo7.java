package day15;

public class Demo7 {
//can we use for each loop with 2D array??
	
	public static void main(String[] args) {
//		String s="bhanu";
//		System.out.println(s);//bhanu -String
//		
//		String[] a= {"bhanu"};
//		System.out.println(a);//[Ljava.lang.String@185sfjkshfj--String[]
//		System.out.println(a[0]);//bhanu  String  
//		
//		String[][] b={{"bhanu"}};
		
		String[][] a= {{"A1","B1"},{"A2","B2"},{"A3","B3"}};
		
		
		for(String[] b:a)
		{
			for(String c:b)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
