/*Escreva um programa que leia dois números inteiros A e B quaisquer indicando se A é 
 * múltiplo de B ou se B é múltiplo de A
 */

package lista;

import java.util.Scanner;

public class ex11 {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		int numA, numB;
		
		System.out.print("Insira o primeiro número: ");
		numA = entrada.nextInt();
		
		System.out.print("Insira o segundo número: ");
		numB = entrada.nextInt();
		
		if(numB % numA == 0){ 
			System.out.print("O primeiro número é multiplo do segundo!");
		}else if(numA % numB == 0){
			System.out.print("O segundo número é multiplo do primeiro!");
		}else if(numB % numA != 0 && numA % numB != 0){
			System.out.print("Os números não são multiplos!");
		}
	}
}
