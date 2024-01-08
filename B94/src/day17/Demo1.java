package day17;

public class Demo1
{
	//can we have multiple return statement in a method?
	//No, but if we have multiple blocks inside the method then we have 1 return statement per each block
	
	public static String m1(int i)
	{
		if(i>0)
		{
			return "It is +ve number";
		}
		else
		{
			return "It is not a +ve number";
		}

	}
	
	public static void main(String[] args)
	{
		String msg = Demo1.m1(-3);
		System.out.println(msg);
	}


}