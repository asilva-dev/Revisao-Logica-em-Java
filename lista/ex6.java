/*Escreva um programa que leia dois valores, os quais denominaremos A e B, fornecidos pelo usuário,
 * exibindo respostas F ou V para as seguintes questões:
 *(a) A é maior que zero?
 *(b) B é maior que zero;
 *(c) A E B são maiores do que zero?
 *Use operadores lógicos para formular as expressões necessárias a avaliação dos valores.  
 */

package lista;

import java.util.Scanner;

public class ex6 {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		int numA, numB;
		
		System.out.print("Insira o primeiro número inteiro:");
		numA = entrada.nextInt();
		
		System.out.print("Insira o segundo número inteiro:");
		numB = entrada.nextInt();
		
		System.out.print("Os numeros inseridos são: " +numA +" e " + numB + "."+"\n\n");
		
		if(numA > 0){
			System.out.print("A) O número A é maior que 0!"+"\n");
		}else{
			System.out.print("A) O número A é menor que 0!"+"\n");
		}
		
		if(numB > 0){
			System.out.print("B) O número B é maior que 0!"+"\n");
		}else{
			System.out.print("B) O número B é menor que 0!"+"\n");
		}
		
		if(numA > 0 && numB > 0){
			System.out.print("C) Os números A e B são maiores que 0!"+"\n");
		}else if(numA < 0 && numB > 0) {
			System.out.print("C) O número A é menor que 0 e o B é maior que 0!"+"\n");
		}else if(numA > 0 && numB < 0){
			System.out.print("C) O número A é maior que 0 e o B é menor que 0!"+"\n");
		}else if(numA < 0 && numB < 0){
			System.out.print("C) Os números A e B são menores que 0!"+"\n");
		}
	}
}
