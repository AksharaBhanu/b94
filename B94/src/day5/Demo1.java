package day5;

public class Demo1 {
/*can we convert 1 data type to another data type?
 * yes---> type casting
 * short b=(short)a;
 * 
 * while converting data from smaller type to bigger type we need not
 * specify conversion type 
 * 
 * converting smaller type to bigger type---> widening --> auto widening--> we dont loose data
 * converting from bigger type to smaller type-> narrowing--> explicit  ---> we may loose data
 * widening syntax
 * BiggerDataType var2=var1;  var1 is smaller data type
 * 
 * narrowing
 * SmallerDatatype var2=(SmallerDatatype) var1;  var1 is bigger data type
 */
	public static void main(String[] args) {
		byte a=10;
		short b=(short)a;//converting from byte to short 
		short c=a;
		
		byte d=(byte)b;
		
		char x='a';
		int i=x;
		char p=(char)i;
		
		System.out.println(i);
		System.out.println(p);
		
		
		byte e=10;
		double ee=e;
		
		int kk=70;
		double pp=kk;
		byte bbb=(byte)kk;
	}

}
