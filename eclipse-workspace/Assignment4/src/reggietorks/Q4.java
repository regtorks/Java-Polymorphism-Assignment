package reggietorks;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int x;
		System.out.print("Enter an integer: ");
		x = input.nextInt();
		int k;
		k = 0;
		if (isEven(k)) {
			System.out.println("Number is even");
			
		}
		else {
			System.out.println("Number is odd");
		}

	}
    public static boolean isEven(int k) {
    	if (k % 2 == 0) {
    	return true;
    	}
    	else {
    		return false;
    }
   
    }
}
