/*
 *Leia um n�mero qualquer fornecido pelo usu�rio. Determine se o n�mero � maior do que 50, 
 *imprimindo uma mensagem indicando tal fato.  
 */

package lista;

import java.util.Scanner;

public class ex3 {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.print("Insira um numero inteiro qualquer: ");
		num = entrada.nextInt();
		
		if(num > 50){
			System.out.print("O n�mero inserido �: " + num +"\n"+"N�mero maior que 50!" );
		}else{
			System.out.print("O n�mero inserido �: " + num +"\n"+"N�mero menor que 50!" );
		}
	}

}
