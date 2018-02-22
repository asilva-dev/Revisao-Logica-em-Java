package lista;

import java.util.Scanner;

public class Ex27 {
	public static void main(String[ ] args) {
        Scanner coleta = new Scanner(System.in);
        float a=0,b=0,c=0;
        double resultado=0;
        int i=0;
        
        do {
	        System.out.println("Calculo da média aritmética");
	        
	        System.out.println("Digite a primeira nota:");
	        a = coleta.nextFloat();
	        if(a > 0 ) {
	        	System.out.println("Digite a segunda nota:");
		        b = coleta.nextFloat();
			    if( b > 0) {
		        	System.out.println("Digite a terceira nota:");
		        		c = coleta.nextFloat();
			        if(c > 0) {	
			        	resultado = (a + b + c)/3;
			     	    System.out.println("A média é:"+resultado);			        	
			        }			            	
			    }     	        	
	        }else{
	       
	        }
	        i ++;
         } while(a > 0 && b >0 && c > 0);
 
	}
}
