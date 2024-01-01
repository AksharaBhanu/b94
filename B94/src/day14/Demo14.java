package day14;

public class Demo14 {
	public static void main(String[] args) {
		int[] a=new int[4];
		
		int n=10;
		for(int i=0;i<a.length;i++)
		{
			a[i]=n;//writing into array
			n=n+10;
		}
		
//		for(int p:a)
//		{
//			p=n;
//			n=n+10;
//		}
		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);//reading from array
//		}
		
		for(int v:a)
		{
			System.out.println(v);
		}
	}
}
