package day19;
class B
{
	int n=100;//global variable
	
	B()
	{
		int n=10;//local variable
		System.out.println(n);//10
		System.out.println(this.n);//100
		
	}
}
public class Demo4 {

	public static void main(String[] args) {
	
		B b1=new B();
		System.out.println(b1.n);//100
	
		

	}

}
