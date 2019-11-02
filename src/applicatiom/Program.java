//Fazer um programa para ler um valor númerico qualquer
//e mostrar qual seria o valor da circunferência e do volume
//de uma esfera para o raio daquele valor. Informar valor 
// de PI (constante).
package applicatiom;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Program {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter com o radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circunferencia (radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("circunferencia: %.2f%n", c);
		System.out.printf("volume %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();
	}

		
}

