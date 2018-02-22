/*Escreva um programa que leia um número real fornecido pelo usuário, armazenando-o numa
 *variável apropriada. Imprima o valor lido. 
 */

package lista;

import java.util.Scanner;

public class ex2 {
	
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		float num;
		
		System.out.print("Insira um número real: ");
		num = entrada.nextFloat();
		
		System.out.print("O número digitado foi: " + num + "\n\n");
		
	}
}	
	
			
			