/*Escreva um programa capaz de calcular o preço total a ser pago por uma compra de copos plásticos.
 *O usuário deve fornecer o número de copos a serem comprados e o programa deve calcular o 
 *preço total a ser cobrado, exibindo-o.
 *Observe que: se o número de copo é inferior ou igual a 100, o preço por copo é R$0.05; 
 *se o número de copos está entre 101 e 500, o preço por copo é R$0.04; 
 *finalmente se o número de copos é superior a 500 o preço por copo é R$0.035
 */

package lista;

import java.util.Scanner;

public class ex12 {
	public static void main(String[]args){
	Scanner entrada = new Scanner(System.in);
	int qtd;
	double vlr;
	
	System.out.print("Quantos copos deseja comprar: ");
	qtd = entrada.nextInt();
	
	if(qtd <= 100){
		vlr = qtd * 0.05;
		System.out.print("O valor total a ser pago eh: R$" + vlr);		
	}else if(qtd > 100 && qtd <= 500){
		vlr = qtd * 0.04;
		System.out.print("O valor total a ser pago eh: R$" + vlr);
	}else if(qtd > 500){
		vlr = qtd * 0.035; //Falta arrumar o float
		System.out.print("O valor total a ser pago eh: R$" + vlr);
	}
		
	}
}
