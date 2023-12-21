package day6;

public class Demo9 {
//conditional operator condition? true-exp1:false-exp2;
	public static void main(String[] args) {
		
		String msg=10>5? "hi":"bye";
		System.out.println(msg);
		
		msg=10>50? "hi":"bye";
		System.out.println(msg);
		
		int i=100>50? 5:7;
		System.out.println(i);
		
		int s=100>5? 5:'b';
		System.out.println(s);
		
		System.out.println((10>50 && 10> 500)?"hi":"bye");
		

	}
}
