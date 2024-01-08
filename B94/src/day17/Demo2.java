package day17;

public class Demo2 {
//i want to return 2 values from a method , how do i do it
// i have a method with takes x & y , i want return x+y and x*y
//	we use array or collection to return multiple values from a method
	
	public static int[] m1(int x,int y)
	{
		int sum=x+y;
		int product=x*y;

		int[] result= {sum,product};
		
		return result;

	}
	public static void main(String[] args) {
		
		int[] a = Demo2.m1(10,20);
		System.out.println("Sum is:"+ a[0]);
		System.out.println("Product is:"+ a[1]);
	}

}
