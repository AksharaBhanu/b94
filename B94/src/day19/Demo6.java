package day19;
class D
{
	int id;
	
	D(int id)
	{// if the name of GV and LV is same & to access GV we use this keyword
	  this.id=id;
	}
}
public class Demo6 {

	public static void main(String[] args) {
		
		D d1=new D(10);
		System.out.println(d1.id);
		

	}

}
