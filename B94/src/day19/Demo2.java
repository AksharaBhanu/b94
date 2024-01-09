package day19;

class Belt
{
	String color="Black";
}

class Dog
{
	String name="Bruno";	
	Belt belt=new Belt();
	
}


public class Demo2 {

	public static void main(String[] args) 
	{
		int i=1;
		int j=i;
		
		Dog myDog=new Dog();
		Dog v1 = myDog;
		String v2=myDog.name;
		Belt v3 = myDog.belt;
		Belt v4 = v3;
		String c = v3.color;
		
		System.out.println(myDog);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(c);

	}

}
