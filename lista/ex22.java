/*Considerando um objeto móvel em movimento uniformemente variado, escreva um programa que receba
 *as seguintes informações: um valor real indicando posição inicial do móvel P0, um valor real que
 *corresponde a velocidade do móvel V, um outro valor real A correspondente a aceleração do móvel
 *e um número inteiro correspondente ao tempo decorrido T. O programa deve calcular a posição final
 *PF do móvel, dado pela relação abaixo: PF = P0 + V * T + (A * T2) / 2
 */

package lista;

import java.util.Scanner;

public class ex22 {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		float po, v, a, pf;
		int t;
		
		System.out.print("Insira a posicao inicial: ");
		po = entrada.nextFloat();
		
		System.out.print("Insira a velocidade do movel: ");
		v = entrada.nextFloat();
		
		System.out.print("Insira a aceleracao do movel: ");
		a = entrada.nextFloat();
		
		System.out.print("Insira o tempo decorrido: ");
		t = entrada.nextInt();
		
		pf = po + v * t +(a *(t*t))/2;
		
		System.out.print("A posicao final eh: " + pf);
		
	}

}
