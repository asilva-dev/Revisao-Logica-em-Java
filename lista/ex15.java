/*Escreva um programa que realize as seguintes tarefas:
a) Efetue a leitura de dois valores inteiros, os quais serão denominados x e y;
b) Realize a soma dos valores x e y, exibindo seu resultado;
c) Realize o produto dos valores x e y exibindo seu resultado;
d) Compare os valores x e y, indicando se "X > Y", "X = Y" e "X < Y" para os casos correspondentes.
*/

package lista;

import java.util.Scanner;

public class ex15 {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		int x, y, soma, prod;
		
		System.out.printf("Insira um numero inteiro:");
		x = entrada.nextInt();
		System.out.printf("Insira outro numero inteiro:");
		y = entrada.nextInt();
		
		soma = x + y;		
		System.out.printf("A soma de "+x+" + "+y +" eh: "+soma+"\n");
		
		prod = x * y;
		System.out.printf("O produto de "+x+" + "+y +" eh: "+prod+"\n");
		
		if(x > y){
			System.out.printf(x + " eh maior que "+ y);
		}else if(x == y){
			System.out.printf(x + " eh igual "+ y);
		}else if(x < y){
			System.out.printf(x + " eh menor que "+ y);
		}
	}
}
