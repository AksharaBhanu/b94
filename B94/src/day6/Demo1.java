package day6;

public class Demo1 {

	public static void main(String[] args) {
		

		//post -inc --> 1st store then inc
		int b=10;
		int c=b++;//store the b value in c, take b value (10), inc by 1 (11), store it in b		
		System.out.println(b);//11
		System.out.println(c);//10
		
		//pre-increment --> 1st inc & then store
		int x=10;
		int y=++x;//take x value (10),inc by 1 (11),store it in x,store it in y
		System.out.println(x);//11
		System.out.println(y);//11
		
		
		int p=10;
		p++; //--> take the value of a (10), increment it by 1 (11) and store it back a
		System.out.println(p);//11
		
		int q=10;
		++q;
		System.out.println(q);//11
	}

}
