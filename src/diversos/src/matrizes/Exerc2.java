package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args){
			Locale.setDefault(Locale.US);			
			Scanner sc = new Scanner(System.in);
			
			int[] primos = { 2,3,5,7,11,13,17,19,23,29,31 };
			int[] somas = new int[11];
			
			for(int i = 0; i < 11; i++){
			 somas[i] = 0;
				for(int j = 0; j <= i; j++)			
					somas[i] += primos[j];			}
				    System.out.print("somas" + somas);
						for(int i = 0; i < 11; i++)
							System.out.print(" " + somas[i]);
				System.out.println();
			sc.close();
	}
}
