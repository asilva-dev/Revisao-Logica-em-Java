/*Escrev
 * a um programa que leia um valor real correspondente a uma medida em metros, convertendo
 *o valor dado em p�s (1 metro = 3.315 p�s), exibindo os valores dado e convertido. Caso o 
 *usu�rio forne�a um valor negativo, deve ser exibida uma mensagem e a opera��o de convers�o 
 *n�o deve ser efetuada.
 */

package lista;

import java.util.Scanner;

public class ex20 {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		float mt,pes;
		
		System.out.printf("Insira o valor de metros: ");
		mt = entrada.nextFloat();
		
		if(mt < 0){
			System.out.printf("Metragem negativa, nao eh possivel converter!");
		}else{ 
			pes = mt / 3315;
			System.out.printf("Os metros convertidos em pes sao: " + pes);
			
		}
		
	}

}
