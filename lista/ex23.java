/*Escreva um programa que receba as seguintes informações: um valor real indicando capital inicial
 *PV, um valor real que corresponde a taxa de juros da aplicação J e um número inteiro de períodos
 *da aplicação N. O programa deve retornar o capital futuro FV dado pela relação abaixo:
 * FV = PV * ( 1 + J )N
 */

package lista;

import java.util.Scanner;

public class ex23 {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		float pv, j, fv, fv1, n;
		//int n;
		
		System.out.print("Insira o capital inicial: ");
		pv= entrada.nextFloat();
		
		System.out.print("Insira a :taxa de juros: ");
		j = entrada.nextFloat();
		
		System.out.print("Insira o periodo da aplicacao: ");
		n = entrada.nextInt();
		
		fv = pv * (1 +j)*n;
		//Math.pow(fv,n);
		
		System.out.print("A posicao final eh: " + fv);
	}
}
