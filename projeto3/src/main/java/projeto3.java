import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class projeto3 { 
    
    public static void main(String args[]){  
       
    Scanner teclado = new Scanner(System.in); 
        
    String nome;
    int vitorias;
    int empates;
    
    System.out.println("Digite o nome do time de futebol");
    nome = teclado.next();
     
    System.out.println("Digite o numero de vitorias ");
    vitorias = teclado.nextInt();
    
    System.out.println("Digite o numero de empates" );
    empates = teclado.nextInt();
           
    System.out.println(vitorias*3);
    
    System.out.println(empates*1);
    
    System.out.println(nome);
   
    
   } 

}
    