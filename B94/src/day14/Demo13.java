package day14;

public class Demo13 {
	public static void main(String[] args) {
		int[] a=new int[4];
		
		int n=10;
		for(int i=0;i<a.length;i++)
		{
			a[i]=n;//writing into array
			n=n+10;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);//reading from array
		}
	}
}
