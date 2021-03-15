package reggietorks;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int a;
		int b;
		a = 0;
		b = 0;
		int result1 = addNumber1(a) + addNumber2(b);
		
		System.out.println(result1);
	}
      // Setting up first method
	  
	 public static int addNumber1(int a) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num1 = input.nextInt();
		  return num1;
	 }
	 // Setting up second method
	 
	 public static int addNumber2(int b) {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter number : ");
		 int num2 = input.nextInt();
		 return num2;
	 }
	 
}
