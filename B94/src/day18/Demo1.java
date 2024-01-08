package day18;
//in cmd --> java Demo1 Apple Mango Grapes
//use of String[] args of main method?-> used to accept cmd line arguments
public class Demo1 {

	public static void main(String[] a) {
		System.out.println("Hi");
		System.out.println(a.length);//number of elements stored in array args
		for(String v:a)
		{
			System.out.println(v);
		}
	}
}
