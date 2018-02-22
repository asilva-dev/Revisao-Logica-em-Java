/*Leia três números quaisquer, imprimindo-os em ordem crescente. 
 */

package lista;

import java.util.Scanner;

public class ex10 {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		int numA, numB, numC;
		
		System.out.print("Insira o primeiro número:");
		numA = entrada.nextInt();
		
		System.out.print("Insira o segundo número: ");
		numB = entrada.nextInt();
		
		System.out.print("Insira o terceiro numero: ");
		numC = entrada.nextInt();
		
		if (numA <= numB && numB <= numC)
	    {
			System.out.print("A ordem crescente: " + numA + "," + numB + "," + numC);
	    }
	  else if (numA <= numC && numC <= numB)
	    {
		  System.out.print("A ordem crescente: " + numA + "," + numC + "," + numB);
	    }
	  else if (numB <= numA && numA <= numC)
	    {
		  System.out.print("A ordem crescente: " + numB + "," + numA + "," + numC);
	    }
	  else if (numB <= numC && numC <= numA) 
	    {
		  System.out.print("A ordem crescente: " + numB + "," + numC + "," + numA);
	    }
	  else if (numC <= numA && numA <= numB) 
	    {
		  System.out.print("A ordem crescente: %d %d %d\n" + numC + "," +  numA + "," + numB);
	    }
	  else /* n3 <= n2 && n2 < n1 */
	    {
		  System.out.print("A ordem crescente: %d %d %d\n" + numC + "," + numB + "," + numA);
	    }
	}
}
