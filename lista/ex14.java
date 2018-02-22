/*Escreva um programa que leia 3 notas (valores reais), calculando e exibindo sua média aritmética.
 *Imprima também "Aprovado" se a média for maior que 7, "Reprovado" se for menor que 3 e "Exame" 
 *se estiver entre 3 e 7.
 */

package lista;

import java.util.Scanner;

public class ex14 {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		float nt1, nt2, nt3, res;
		
		System.out.printf("Insira a primeira nota: "+"\n");
		nt1 = entrada.nextFloat();
		System.out.printf("Insira a segunda nota: "+"\n");
		nt2 = entrada.nextFloat();
		System.out.printf("Insira a terceira nota: "+"\n");
		nt3 = entrada.nextFloat();
		
		res = (nt1 + nt2 + nt3)/3;
		System.out.print("Sua media aritmetica e: "+res+"\n");
		
		if(res > 7){
			System.out.print("Situacao final: Aprovado!");
		}else if(res < 3){
			System.out.print("Situacao final: Reprovado!");
		}else if(res >= 3 && res <= 7){
			System.out.print("Situacao final: Você está de exame!");
		}
	}
}
