package aplication;
import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {
	
	public static void main(String[] args) {		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);			
		Retangulo x;
		x = new Retangulo();
		
		System.out.println("Enter the measures of widht and height: ");	
		System.out.print("altura: ");
	    x.altura = sc.nextDouble();	   
		System.out.print("largura: ");
	    x.largura = sc.nextDouble();  
	    
	    double areax = x.area();
	    double perimetrox = x.perimetro();
	    double diagonalx = x.diagonal();
        
	    System.out.printf("Retangulo X, area: %.2f%n", areax);
	    System.out.printf("Retangulo X, perimetro; %.2f%n", perimetrox);
	    System.out.printf("Retangulo X, diagonal; %.2f%n", diagonalx);
	    
	    
	    
		
		
		
	sc.close();	
	}

}
