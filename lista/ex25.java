package lista;

import java.util.Scanner;

public class ex25 {
	public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        
        double num, soma = 0;
        int cont = 0;
        
        do{
            System.out.println("Digite um número");
            num = ent.nextDouble(); 
            
                soma = num + soma; 
                cont++;
                System.out.println("A soma é " + soma); 
            
        } while(num > 0 || num < 0); 
                   
    }

}
