package lista;

import java.util.Scanner;

public class ex13 {
	  public static void main(String[ ] args) {
		     Scanner coleta = new Scanner(System.in);
	
		     float a,b,c;
			System.out.println("Digite os valores e descubra qual tipo de triangulo �");
			
			System.out.println("Digite a primeira medida:");
				a = coleta.nextFloat();
				
		    System.out.println("Digite a segunda medida:");
		    	b = coleta.nextFloat();
		    	
		    System.out.println("Digite a base:");
		    	c = coleta.nextFloat();

		    if((a < b + c)&&(b < a + c)&&(c < a + b)){
		        if((a == b) && (b == c)&&(a == c)){
		        	System.out.println("\nTri�ngulo Equil�tero");
		        }
		        else if ((a == b)||(b == c)||(a == c)){
		        	System.out.println("Tri�ngulo Is�celes");
		        }else {
		        	System.out.println("Tri�ngulo esqualeno");}
		
		     }else{
		    	 System.out.println("n�o � possiv�l formar um tri�ngulo");
		    }
	  }
}
