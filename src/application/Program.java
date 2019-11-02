package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {
	
	public static void main (String [] args){
		
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 Funcionario funcionario = new Funcionario();
		 		
		 System.out.print("Name: ");
		 funcionario.name = sc.nextLine();		

		 System.out.print("Gross salary: ");
		 funcionario.grossSalary = sc.nextDouble();
		 
		 System.out.print("tax: ");	 
		 funcionario.tax = sc.nextDouble();			 		 
		 System.out.print("wich percentage to increase Salary?: ");
		 double percentage = sc.nextDouble();
		 funcionario.increaseSalary(percentage);		
		 System.out.println();
		 System.out.println("update data:  "  + funcionario);	 
		 sc.close();
			 
	}	 
	 			
		 }			
				
				
				
		 
			
			
		
		 
	
	
