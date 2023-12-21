package day7;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz Select your language:\n1.Kannada\n2.Telugu\n3.Urdu\n4.Marathi\n5.Odiya\n:");
		int language=sc.nextInt();
		sc.close();
		
		if(language==1)
		{
			System.out.println("You have selected:ಕನ್ನಡ");
		}
		else if(language==2)
		{
			System.out.println("You have selected:తెలుగు");
		}
		else if(language==3)
		{
			System.out.println("You have selected:اردو");
		}
		else if(language==4)
		{
			System.out.println("You have selected:मराठी");
		}
		else if(language==5)
		{
			System.out.println("You have selected:ଓଡିଆ");
		}
		else
		{
			System.err.println("You have selected invalid input");
		}
		
		System.out.println("Thank You");
	}

}
