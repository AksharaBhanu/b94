package day19;
class Student
{
	int id;
	String name;
	
	Student(int a,String b)
	{
		id=a;
		name=b;
	}
}
public class Demo3 {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"Akash");
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		Student s2=new Student(2,"Bharathi");
		System.out.println(s2.id);
		System.out.println(s2.name);
		

	}

}
