package entities;

//Fazer um Programa para ler os valores da largura e altura de um Retângilo.
//Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal usando uma
//Classe.
// width: double, height double, com atributos e Area:double, Perímetro:double e diagonal:double 
//como parâmetros.

//Area(a) = base(b) * altura(h).
//Perímetro(p) = 2(b+h)
//Diagonal(d)=√b²+h²
public class Retangulo {
	public double altura;
	public double largura;
	
	
	public double area(){		
		return altura * largura;	
		}
	
	public double perimetro(){		
		return 2*(altura + largura); 	
	}
	public double diagonal(){		
		return Math.sqrt((altura*altura + largura * largura));
	}
	
	
}



