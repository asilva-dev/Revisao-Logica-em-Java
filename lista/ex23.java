/*Escreva um programa que receba as seguintes informa��es: um valor real indicando capital inicial
 *PV, um valor real que corresponde a taxa de juros da aplica��o J e um n�mero inteiro de per�odos
 *da aplica��o N. O programa deve retornar o capital futuro FV dado pela rela��o abaixo:
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
