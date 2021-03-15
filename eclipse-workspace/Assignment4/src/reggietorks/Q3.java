package reggietorks;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define a method to find out if the number is prime or not 

       		System.out.println(isPrime(3));
       		System.out.println(isPrime(8));
		
		
	}
	public static boolean isPrime(int y) {
		boolean prime = true;
		if (y>1) {
			for(int i = 2; i < y; i++) {
				if(y%i == 0) {
					prime =false;
					break;
				}
			}
		}
			else {
				prime = false;
			
			}
			return prime;	
	}
	
	}    

