/*Escreva um programa que leia um número inteiro fornecido pelo usuário, armazenando-o numa
 * variável apropriada. Imprima o valor lido 
 */

package lista; //Nome do projeto

import java.util.Scanner; // Classe que recebe valores

public class ex1 {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.print("Insira um número inteiro: " +"\n\n");
		num = entrada.nextInt();
		
		System.out.print("O número inserido é: " + num + "\n");
		
	}
}
