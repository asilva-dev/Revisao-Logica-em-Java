/*Preparar um programa para ler as medidas da base e da altura de um tri�ngulo, calculando e 
* imprimindo sua �rea, sabendo que o c�lculo da �rea � dado por: area = (base*altura)/2.
*/

package lista;

import java.util.Scanner;

public class ex16 {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		int base, alt, area;
		
		System.out.printf("Insira a base do triangulo: ");
		base = entrada.nextInt();
		
		System.out.printf("Insira a altura do triangulo: ");
		alt = entrada.nextInt();
		
		area = (base * alt)/2;
		
		System.out.printf("A area do triangulo eh: " + area);
		
	}

}
