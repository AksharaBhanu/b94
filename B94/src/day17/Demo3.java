package day17;

public class Demo3 {
	
	public static int[] m1(int[] a)
	{
		int sum=a[0]+a[1];
		int product=a[0]*a[1];

		int[] result= {sum,product};
		
		return result;

	}
	public static void main(String[] args) {
		
		int[] p= {10,20}; 
		int[] a = Demo3.m1(p);
		System.out.println("Sum is:"+ a[0]);
		System.out.println("Product is:"+ a[1]);
	}

}
