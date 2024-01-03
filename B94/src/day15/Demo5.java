package day15;

public class Demo5 {

	public static void main(String[] args) {
		String[][] a=new String[3][3];
		a[0][0]="A1";
		a[0][1]="B1";
		a[0][2]="C1";
		
		a[1][0]="A2";
		a[1][1]="B2";
		a[1][2]="C2";
		
		a[2][0]="A3";
		a[2][1]="B3";
		a[2][2]="C3";
		
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
