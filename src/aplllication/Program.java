//ler a cotação do dolar.
//ler uma quantidade em dolar a ser comprado.
//ler uma taxa de IOF(6%).(static).
//mostrar o total convertido em R$
//Deduzir a taxa.
//Mostar o valor total em R$.
package aplllication;
import java.util.Locale;
import java.util.Scanner;

import util.ConversorMoedas;



public class Program {	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		
		Locale.setDefault(Locale.US);
		Scanner sc =   new Scanner(System.in);	
		
		System.out.println("Valor do US$?: ");
		double US$ = sc.nextDouble();
		System.out.println("Quantos US$ vai comprar?: ");
		double TotUS$ = sc.nextDouble();
		
		double t = ConversorMoedas.TotIOF(TotUS$, US$);
		double i = ConversorMoedas.TotCompra(TotUS$, US$);
		
		System.out.printf("Total da IOF:  %.2f%n", t);
		//System.out.printf("IOF Valor: %.2f%n",ConversorMoedas.IOF);
	    System.out.printf("Total Compra: %.2f%n", i);
	    System.out.printf("Total a Pagar: %.2f%n", i + t);
		sc.close();
		
		}
}	
	
	
	
	
	
	