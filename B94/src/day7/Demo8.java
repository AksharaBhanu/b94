package day7;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz Select your language:\n1.Kannada\n2.Telugu\n3.Urdu\n4.Marathi\n5.Odiya\n:");
		int language=sc.nextInt();
		sc.close();
		
		switch(language)
		{
			
			case 1:System.out.println("You have selected:ಕನ್ನಡ");break;
			case 2:System.out.println("You have selected:తెలుగు");break;
			case 3:System.out.println("You have selected:اردو");break;
			case 4:System.out.println("You have selected:मराठी");break;
			case 5:System.out.println("You have selected:ଓଡିଆ");break;
			default:System.err.println("You have selected invalid input");break;
		}
		
		System.out.println("Thank You");
	}

}
