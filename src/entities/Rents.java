/*A dona de um pensionato possui dez quartos para alugar para estudantes,sendo esses
 quartos identificados pelos numerados de 0 a 9.
 Fazer um programa que inicie dos todos os quartos vazios e depois leia um número N
 que representa a quantidade de estudantes que vão alugar quartos(N pode ser de 1 a 10).
 Em seguida, registre o aluguel dos N estudantes. Para cada registro,informar o nome e
 email do estudante bem como o quarto escolhido(0 a 9) supondo que seja escolhido um 
 quarto vago. Ao final o programa deve imprimir um relatorio das ocupações do pensionato
 por ordem de quartos. */


package entities;

public class Rents {
	public String name;
	public String email;
	public Rents(String name, String email) {
		
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString(){
		return name + "," + email;
		
	}
	
	
}
