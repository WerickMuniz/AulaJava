package AulaJava.Exercicio;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        // Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma
        // mensagem que diga
        // se ela poderá ou não votar este ano (não é necessário considerar o mês em que
        // ela nasceu).
        Scanner sc = new Scanner(System.in);
         int ano;
         System.out.println("digite seu ano de nascimento");
         ano = sc.nextInt();
         if (ano <= 2006) { System.out.println("você poderá votar esse ano");}
         else {System.out.println("você não poderá votar esse ano");}
            
         
        


    }
    
}
