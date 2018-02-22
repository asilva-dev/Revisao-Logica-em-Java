/*Escreva um programa que leia um valor inteiro correspondente a uma quantidade de segundos, 
 * convertendo o valor dado em horas corridas sabendo que 3600 segundos equivalem a 1 hora,
 * exibindo os valores dado e convertido. Caso o usuário forneça um valor negativo, deve ser 
 * exibida uma mensagem e a operação de conversão não deve ser efetuada.
 */

package lista;

import java.util.Scanner;

public class ex17 {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		int seg, hr;
		
		System.out.printf("Insira um valor inteiro: ");
		seg = entrada.nextInt();
		
		if(seg < 0){
			System.out.printf("Numero inserido negativo, nao eh possivel converter!");
		}else{ 
			hr = seg / 3600;
			System.out.printf("Foram corridas " + hr +" horas!");
			
		}
		
	}

}
