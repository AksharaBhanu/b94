package day5;

public class Demo2 {

	public static void main(String[] args) {
		short a=127;
		byte b=(byte)a;
		System.out.println(a);
		System.out.println(b);
		
		short a2=200;
		byte b2=(byte)a2;
		System.out.println(a2);
		System.out.println(b2);//data loss
	}

}
