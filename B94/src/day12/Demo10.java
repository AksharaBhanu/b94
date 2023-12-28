package day12;

public class Demo10 {
//print all the prime numbers between 1 to 100
	public static void main(String[] args) {
		boolean isPrime;
		for(int num=1;num<=100;num++){
				if(num==1){
					isPrime=false;//Not a prime number
				}
				else if(num==2){
					isPrime=true;// prime number
				}
				else {
					isPrime=true;// prime number
					for(int i=2;i<num;i++){
						if(num % i == 0){
							isPrime=false;//Not a prime number
							break;
						}
					}
				}
				if(isPrime){
					System.out.println(num);
				}
		}
	}
}
