/*Escreva um programa que leia um n�mero inteiro fornecido pelo usu�rio, armazenando-o numa
 * vari�vel apropriada. Imprima o valor lido 
 */

package lista; //Nome do projeto

import java.util.Scanner; // Classe que recebe valores

public class ex1 {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.print("Insira um n�mero inteiro: " +"\n\n");
		num = entrada.nextInt();
		
		System.out.print("O n�mero inserido �: " + num + "\n");
		
	}
}
