/*Escreva um programa que leia um n�mero real fornecido pelo usu�rio, armazenando-o numa
 *vari�vel apropriada. Imprima o valor lido. 
 */

package lista;

import java.util.Scanner;

public class ex2 {
	
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		float num;
		
		System.out.print("Insira um n�mero real: ");
		num = entrada.nextFloat();
		
		System.out.print("O n�mero digitado foi: " + num + "\n\n");
		
	}
}	
	
			
			