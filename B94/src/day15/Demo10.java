package day15;

public class Demo10 {
//print the smallest number in the array
	public static void main(String[] args) {
		int[] a= {10,2,50,1,8};
		int small=a[0];
		
		for(int n:a)
		{
			if(n<small)
			{
				small=n;
			}
		}
		
		System.out.println(small);
	}

}
