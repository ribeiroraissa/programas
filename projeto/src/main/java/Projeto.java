
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Projeto {
    
    public static void main(String args[]){  
        int a;
        int b;
        int c;
        int valor;
        
        Scanner teclado = new Scanner(System.in);

                
        System.out.println("Digite o valor de a:");
        a = teclado.nextInt();
        
        System.out.println("Digite o valor de b:");
        b = teclado.nextInt();
       
        System.out.println("Digite o valor de c:");
        c = teclado.nextInt();
   
      
        valor = (a + b)/c;
        
        System.out.print(valor);
     
    
        System.exit(0);
		
	}


		
     }


     
    

