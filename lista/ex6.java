/*Escreva um programa que leia dois valores, os quais denominaremos A e B, fornecidos pelo usu�rio,
 * exibindo respostas F ou V para as seguintes quest�es:
 *(a) A � maior que zero?
 *(b) B � maior que zero;
 *(c) A E B s�o maiores do que zero?
 *Use operadores l�gicos para formular as express�es necess�rias a avalia��o dos valores.  
 */

package lista;

import java.util.Scanner;

public class ex6 {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		int numA, numB;
		
		System.out.print("Insira o primeiro n�mero inteiro:");
		numA = entrada.nextInt();
		
		System.out.print("Insira o segundo n�mero inteiro:");
		numB = entrada.nextInt();
		
		System.out.print("Os numeros inseridos s�o: " +numA +" e " + numB + "."+"\n\n");
		
		if(numA > 0){
			System.out.print("A) O n�mero A � maior que 0!"+"\n");
		}else{
			System.out.print("A) O n�mero A � menor que 0!"+"\n");
		}
		
		if(numB > 0){
			System.out.print("B) O n�mero B � maior que 0!"+"\n");
		}else{
			System.out.print("B) O n�mero B � menor que 0!"+"\n");
		}
		
		if(numA > 0 && numB > 0){
			System.out.print("C) Os n�meros A e B s�o maiores que 0!"+"\n");
		}else if(numA < 0 && numB > 0) {
			System.out.print("C) O n�mero A � menor que 0 e o B � maior que 0!"+"\n");
		}else if(numA > 0 && numB < 0){
			System.out.print("C) O n�mero A � maior que 0 e o B � menor que 0!"+"\n");
		}else if(numA < 0 && numB < 0){
			System.out.print("C) Os n�meros A e B s�o menores que 0!"+"\n");
		}
	}
}
