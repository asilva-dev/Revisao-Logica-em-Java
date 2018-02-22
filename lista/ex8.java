/*Leia três números inteiros fornecidos pelo usuário. Descubra qual deles é o maior de todos, 
 * imprimindo seu valor. 
 */
package lista;

import java.util.Scanner;

public class ex8 {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		int numA, numB, numC;
		
		System.out.print("Insira o primeiro número:");
		numA = entrada.nextInt();
		
		System.out.print("Insira o segundo número: ");
		numB = entrada.nextInt();
		
		System.out.print("Insira o terceiro numero: ");
		numC = entrada.nextInt();
		
		if(numA > numB && numA >numC){
			System.out.print("O número A é " + numA + " e trata-se do maior entre os três inseridos!");
		}else if(numB > numA && numB >numC){
			System.out.print("O número B é " + numB + " e trata-se do maior entre os três inseridos!");			
		}else if(numC > numA && numC >numB){
			System.out.print("O número C é " + numC + " e trata-se do maior entre os três inseridos!");	
		}
	}
}
