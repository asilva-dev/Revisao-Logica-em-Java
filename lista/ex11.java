/*Escreva um programa que leia dois n�meros inteiros A e B quaisquer indicando se A � 
 * m�ltiplo de B ou se B � m�ltiplo de A
 */

package lista;

import java.util.Scanner;

public class ex11 {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		int numA, numB;
		
		System.out.print("Insira o primeiro n�mero: ");
		numA = entrada.nextInt();
		
		System.out.print("Insira o segundo n�mero: ");
		numB = entrada.nextInt();
		
		if(numB % numA == 0){ 
			System.out.print("O primeiro n�mero � multiplo do segundo!");
		}else if(numA % numB == 0){
			System.out.print("O segundo n�mero � multiplo do primeiro!");
		}else if(numB % numA != 0 && numA % numB != 0){
			System.out.print("Os n�meros n�o s�o multiplos!");
		}
	}
}
