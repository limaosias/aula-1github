package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Progran {
	public static void main(String[] args) {
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle x; ");
		x.a= sc.nextDouble();
		x.b= sc.nextDouble();
		x.c= sc.nextDouble();
		
	    System.out.println("Enter the measures of triangle y; ");
	    y.a=sc.nextDouble();
	    y.b=sc.nextDouble();
	    y.c=sc.nextDouble();
	    
	   double areax = x.area();
	   double areay = y.area(); 
	   
	   	   
	   System.out.printf("Triangle X, area; %.4f%n", areax);
	   
	   System.out.printf("Triangle Y, area; %.4f%n", areay);
	   
	   if(areax > areay) {
		   System.out.println("larger area: x");
	   }else {
		   System.out.println("larger area: y");
	   }
   
	sc.close();
}

		}
	
	
