package entities;

public class Alunos {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double notaFinal;
	
	public double notaFinal(){	
	return nota1 + nota2 + nota3;
	}
	public double MensagemPontos() {
		if(notaFinal() < 60) {
			return 60 - notaFinal();
		}		
		else {	return 0.0; 				
			}		
	}
}
	