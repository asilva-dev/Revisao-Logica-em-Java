/*
 * Dado um número inteiro qualquer, fornecido pelo usuário, descobrir se o mesmo é par ou ímpar. * 
 */


package lista;

import java.util.Scanner;

public class ex5 {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.print("Insira um número inteiro qualquer:");
		num = entrada.nextInt();
		
		if(num % 2 <= 0){
			System.out.print("O numero inserido é par.");
		}else{
			System.out.print("O numero inserido é ímpar.");
		}
	}

}
