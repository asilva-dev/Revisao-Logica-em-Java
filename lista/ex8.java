/*Leia tr�s n�meros inteiros fornecidos pelo usu�rio. Descubra qual deles � o maior de todos, 
 * imprimindo seu valor. 
 */
package lista;

import java.util.Scanner;

public class ex8 {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		int numA, numB, numC;
		
		System.out.print("Insira o primeiro n�mero:");
		numA = entrada.nextInt();
		
		System.out.print("Insira o segundo n�mero: ");
		numB = entrada.nextInt();
		
		System.out.print("Insira o terceiro numero: ");
		numC = entrada.nextInt();
		
		if(numA > numB && numA >numC){
			System.out.print("O n�mero A � " + numA + " e trata-se do maior entre os tr�s inseridos!");
		}else if(numB > numA && numB >numC){
			System.out.print("O n�mero B � " + numB + " e trata-se do maior entre os tr�s inseridos!");			
		}else if(numC > numA && numC >numB){
			System.out.print("O n�mero C � " + numC + " e trata-se do maior entre os tr�s inseridos!");	
		}
	}
}
