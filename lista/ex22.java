/*Considerando um objeto m�vel em movimento uniformemente variado, escreva um programa que receba
 *as seguintes informa��es: um valor real indicando posi��o inicial do m�vel P0, um valor real que
 *corresponde a velocidade do m�vel V, um outro valor real A correspondente a acelera��o do m�vel
 *e um n�mero inteiro correspondente ao tempo decorrido T. O programa deve calcular a posi��o final
 *PF do m�vel, dado pela rela��o abaixo: PF = P0 + V * T + (A * T2) / 2
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
