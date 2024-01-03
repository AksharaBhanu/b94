package day15;

public class Demo1 {

	public static void main(String[] args) {
		int[] a= {10,20,30};
		
		int[] b=new int[3];
		b[0]=10;
		b[1]=20;
		b[2]=30;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int v:b)
		{
			System.out.println(v);
		}

	}

}
