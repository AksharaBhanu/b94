package day11;

public class Demo13 {
//what is the o/p this code
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		int i=0;
		while(i<10)
		{
			i++;
			
			if(i>3 && i<7)
			{
				continue;
			}
			
			System.out.println(i);
			
			
		}
		
		System.out.println("End");
	}

}
