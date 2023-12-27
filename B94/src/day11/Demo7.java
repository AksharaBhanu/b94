package day11;

public class Demo7 {

	public static void main(String[] args) {
		boolean stop=false;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j>3)
				{
					stop=true;
					break;
				}
				System.out.println(i+" - "+j);
				
			}
//			break;
			if(stop) {
				break;
			}
		}

	}

}
