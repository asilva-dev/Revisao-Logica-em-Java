/*Faça um algoritmo que, lendo 3 números correspondentes aos coeficientes a, b, e c de uma equação
 *do 2º grau, calcule seu DELTA e também as raízes desta equação, imprimindo seus valores.
 */

package lista;

import java.util.Scanner;

public class ex21 {
	  public static void main(String[ ] args) {
		     Scanner coleta = new Scanner(System.in);
			double a, b, c, delta, raiz,x1,x2;

				System.out.println("Calculo de equação de segundo grau!");
				System.out.println("Digite  o valor de A:");
					a = coleta.nextDouble();

				System.out.println("Digite o valor de B:");
					b = coleta.nextDouble();

				System.out.print("Digite o valor de C:");
					c = coleta.nextDouble();

					delta = ((b*b)-(4*a*c));

					x1 = 0;

					x2 = 0;

					if (delta >= 0){
							x1 = (-b +Math.sqrt (delta)) / ( 2*a );

							x2 = (-b + Math.sqrt (delta)) / ( 2*a );

							System.out.println("O valor de x1 é: "+ x1);

							System.out.println("O valor de x2 vale: "+ x2);

							System.out.println("O valor de delta é:"+delta);

						}else{
							System.out.println("Delta invalido");
						}
	  }


}
