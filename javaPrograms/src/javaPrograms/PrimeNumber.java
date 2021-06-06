package javaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 5;
		boolean b = false;
		for (int i = 2; i < num; i++) {
			if(num%i==0) {
				
				b=true;	
			}
			
		}
			if(b=true) {System.out.println("composte");
				
				
			}
			else {
				System.out.println("prime");
			}
			
			

	}

}
