/*
 * Dado um n�mero inteiro qualquer, fornecido pelo usu�rio, descobrir se o mesmo � par ou �mpar. * 
 */


package lista;

import java.util.Scanner;

public class ex5 {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.print("Insira um n�mero inteiro qualquer:");
		num = entrada.nextInt();
		
		if(num % 2 <= 0){
			System.out.print("O numero inserido � par.");
		}else{
			System.out.print("O numero inserido � �mpar.");
		}
	}

}
