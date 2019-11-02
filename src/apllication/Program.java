package apllication;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class Program {

	public static void main(String[] args) {
		
		Alunos alunos  = new Alunos();
		
		Locale.setDefault(Locale.US);
		Scanner sc =   new Scanner(System.in);
		
		System.out.println("Nome: ");
		alunos.nome = sc.nextLine();		
		System.out.print("nota1: ");
		alunos.nota1 = sc.nextDouble();		
		System.out.print("nota2: ");
		alunos.nota2 = sc.nextDouble();	
		System.out.print("nota3: ");
		alunos.nota3 = sc.nextDouble();		
		//System.out.print("notaFinal: ");
		//alunos.notaFinal = sc.nextDouble();
		
		System.out.printf("Nota final:  %.2f%n",alunos.notaFinal());
		
			if(alunos.notaFinal() < 60.0) {
				
			System.out.println("Reprovado!");
			System.out.printf("Faltam %.2f pontos %n para ser aprovado" , alunos.MensagemPontos());				
			
			}
			else {
				System.out.println("Congratulations PASS!");
			}
					
			sc.close();	
			}
		}

		

