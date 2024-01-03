package day15;

public class Demo4 {

	public static void main(String[] args) {
				
		String[][] b=new String[4][2];//2D A /MDA
		b[0][0]="A1";
		b[0][1]="Akash";
		
		b[1][0]="R1";
		b[1][1]="Rama";

		b[2][0]="S1";
		b[2][1]="Sandhya";
		
		b[3][0]="B1";
		b[3][1]="Bhanu";
		
		System.out.println(b);
		System.out.println(b[0]);
		System.out.println(b[0][0]);
		System.out.println("------------");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------------");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
