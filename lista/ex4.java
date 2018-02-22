/*
 *Leia um número qualquer fornecido pelo usuário. Determine se o número é maior do que 100, 
 *imprimindo uma mensagem indicando que o "valor é maior que 100" ou uma mensagem indicando que o 
 *"valor é menor ou igual a 100". 
 */


package lista;

import java.util.Scanner;

public class ex4 {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.print("Insira um número inteiro qualquer:");
		num = entrada.nextInt();
		
		if(num <= 100){
			System.out.print("O numero inserido é:" + num + "\n" +"Menor ou igual a 100");
		}else{
			System.out.print("O numero inserido é:" + num + "\n" +"Maior que 100");
		}
		
	}

}
