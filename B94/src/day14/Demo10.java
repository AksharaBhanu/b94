package day14;

public class Demo10 {

	public static void main(String[] args) {
		int[] a= {10,20};
		int[] b=new int[2];
		double[] c=new double[2];
		boolean[] d=new boolean[2];
		char[] e=new char[2];
		String[] f=new String[2];
		
		System.out.println(a[0]);//10
		System.out.println(a[1]);//20
		
		System.out.println(b[0]);//0----> if array type is--> byte short int long
		System.out.println(b[1]);//0
		
		System.out.println(c[0]);//0.0--> float & double--> 0.0
		System.out.println(d[0]);//if array type is--> boolean then false
		System.out.println("$"+ e[0] +"$");//if array type is char --> then 1 space
		System.out.println(f[0]);
		

	}

}
