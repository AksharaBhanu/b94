package day14;

public class Demo8 {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60};
		
		for(int i=0;i<a.length;i+=2) //we can skip the element
		{
			System.out.println(a[i]);
		}
		
		for(int v:a)		//we can't skip the element
		{
			System.out.println(v);
		}
		
		for(int i=a.length-1;i>=0;i--) //access array element in reverse order
		{
			System.out.println(a[i]);
		}
		
		for(int v:a)//access array element in reverse order not possible
		{
			System.out.println(v);
		}
	}

}
