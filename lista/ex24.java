/*Implementar tr�s programas para exibir a tabuada de um n�mero inteiro entre 1 e 20 dado pelo 
 *usu�rio.
a) Usando enquanto (while)
b) Usando fa�a-enquanto (do-while)
c) Usando para (for)
Obs. Caso o valor dado seja inv�lido o programa deve apenas exibir uma mensagem de aviso.
 */

package lista;

import java.util.Scanner;

public class ex24 {
	public static void main(String[ ] args) {
        Scanner coleta = new Scanner(System.in);
        float a=0,b=0,c=0;
        double resultado=0;
        int i=0;
        
        do {
	        System.out.println("Calculo da m�dia aritm�tica");
	        
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
			     	    System.out.println("A m�dia �:"+resultado);			        	
			        }			            	
			    }     	        	
	        }else{
	       
	        }
	        i ++;
         } while(a > 0 && b >0 && c > 0);
 
  }
		
}
	




