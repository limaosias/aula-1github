package entities;
//programa para ler dados do funcionário(nome,salário bruto
//e imposto). Em seguida, aumentar o salário em uma % dada(sómente
//sobre o sal.bruto) e mostrar o novo salário na tela.

public class Funcionario {
	public String name;
	public double grossSalary;
	public double tax;	
	
	
	
	public double netSalary() {
		return grossSalary - tax;
	}	
	public double increaseSalary( double percentage) {
		return grossSalary += grossSalary * percentage/100.0;			 
	}
	
	public String toString(){
	 return name + ", $ " + String.format("%.2fn",  netSalary());
		
	}
}
	
	