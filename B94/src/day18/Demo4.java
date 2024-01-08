package day18;
class Emp
{
	int id=10;
}
public class Demo4 
{
// multiple ref variable can point to same object 
	public static void main(String[] args)
	{
					
			Emp e1=new Emp();
			e1.id=100;
			
			Emp e2 = e1;
			e2.id=200;
			
			
			System.out.println(e1.id);//200
			System.out.println(e2.id);//200
			
	}

}
