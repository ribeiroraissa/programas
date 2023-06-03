
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Projeto2 {
     
    public static void main(String args[]){  
       
         Scanner teclado = new Scanner(System.in); 
        
        int distancia ;
        int velocidade ;
      
        
        System.out.println("Digite a distancia percorrida de um carro");
        distancia = teclado.nextInt();
    
        System.out.println("Digite a velocidade que o carro percorreu");
        velocidade = teclado.nextInt();
    
    
        double total = distancia/velocidade;
        System.out.print(total);
       
    
    
    }     
    
} 