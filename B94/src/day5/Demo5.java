package day5;

public class Demo5 {
//assignment operator
	public static void main(String[] args) {
		int i=10;
		int j=20;
//		i=i+j;
//		i+=j;
		
//		i=j+i;
		i+=j;
		
//		System.out.println(i);
		
		
		int x=20;
		int y=10;
//		x=x-y;
//		x-=y;
		x=y-x;
		System.out.println(x);
		
		int p=10;
		int q=20;
//		p=p*q;
		p*=q;
		System.out.println(p);
		
		int t=20;
		int k=5;
//		t=t/k;
		t/=k;
		System.out.println(t);
		
		int l=20;
		int m=7;
//		l=l%m;
		l%=m;
		System.out.println(l);
		
	}

}
