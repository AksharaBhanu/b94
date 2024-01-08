package day18;

class Employee
{
	
}


public class Demo2 {

	public static void main(String[] args) {
		int i=10;
		System.out.println(i);
		String s1=new String("Bhanu");//special method whose name is same as class name
		System.out.println(s1);//Bhanu
		
		Employee e1=new Employee();
		System.out.println(e1);//day18.Employee@26f0a63f
		//day18-->package
		//Employee-->class
		//@26f0a63f-->adderss
		//day18.Employee--> Fully Qualified Class Name (FQCN)
		
		Employee e2=new Employee();
		System.out.println(e2);
		
	}

}
