package reggietorks;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to print the circumference and area
		 * of a circle of radius entered by the user by 
		 * defining your own method.
		 */
		double Circumference;
		double Area;
		double r;
		double x;
		x = 0;
		r = addRadius (x);
		
		// Calculating area of a circle
		Area = Math.PI * (r * r);
		System.out.println("Area of a circle:  " + Area);
		
		// Calculating Circumference of a circle
		Circumference = 2 * Math.PI * r;
		System.out.println("Circumference of a circle: " + Circumference);

	}
      // Setting up the method
	public static double addRadius(double x) {
		Scanner input = new Scanner(System.in);
		 System.out.print("Enter radius : ");
		 double rad = input.nextInt();
		 return rad;
		 
	}
	 
	 
	 
}
