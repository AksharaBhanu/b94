package day17;

public class Demo4 {
	
	public static int[] m1(int[] a)
	{
		int sum=0;
		for(int n:a)
		{
			sum+=n;
		}
		
		
		int product=1;
		for(int n:a)
		{
			product*=n;
		}

		int[] result= {sum,product};
		
		return result;

	}
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		
		int[] res = Demo4.m1(a);
		System.out.println("Sum is:"+ res[0]);
		System.out.println("Product is:"+ res[1]);
	}

}
