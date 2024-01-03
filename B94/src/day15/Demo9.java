package day15;

public class Demo9 {
//search for the give fruit in the array
	public static void main(String[] args) {
		String[] fruits= {"Apple","Mango","Grapes","Chiku"};
		
		String requierd="orange";
		
		String msg="Not Found";
		
		for(String fruit:fruits)
		{
			if(fruit.equals(requierd))
			{
				msg="Found";
				break;
			}
			
		}
		
		System.out.println(msg);
	}

}
