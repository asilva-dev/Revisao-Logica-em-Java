/*Escreva um programa capaz de calcular o pre�o total a ser pago por uma compra de copos pl�sticos.
 *O usu�rio deve fornecer o n�mero de copos a serem comprados e o programa deve calcular o 
 *pre�o total a ser cobrado, exibindo-o.
 *Observe que: se o n�mero de copo � inferior ou igual a 100, o pre�o por copo � R$0.05; 
 *se o n�mero de copos est� entre 101 e 500, o pre�o por copo � R$0.04; 
 *finalmente se o n�mero de copos � superior a 500 o pre�o por copo � R$0.035
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
