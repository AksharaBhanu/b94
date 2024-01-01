package day14;

public class Demo7 {

	public static void main(String[] args) {
		String[] s={"A","B","C","D"};
		
		//for i loop
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		//for each loop
		for(String p:s)
		{
			System.out.println(p);
		}
		
		int[] a= {10,20,30,40};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i:a)
		{
			System.out.println(i);
		}
	}

}
