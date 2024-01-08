package day18;
//create student class and create 3 objects
//what we can write inside a class???
//variable declaration & initialization
//method declaration & implementation
//we should write all the codes inside a method
class Student
{
	int id;
}

public class Demo3 {

	public static void main(String[] args) {
		
			
		Student s1=new Student();
		System.out.println(s1.id);
		s1.id=100;
		
		Student s2=new Student();
		s2.id=200;
		System.out.println(s1);
		System.out.println(s1.id);
		
		System.out.println(s2);
		System.out.println(s2.id);

	}

}
