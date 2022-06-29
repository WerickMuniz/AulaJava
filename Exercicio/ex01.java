package AulaJava.Exercicio;

import java.util.Scanner;

public class ex01 {
    
    public static void main(String[] args) {
        
        // Pedir para colocar o nome, a idade e o Endereço do usuario;

        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        String endereço;

        System.out.println("me diga seu nome ?");
        nome = sc.nextLine();
        System.out.println("me diga seu endereço ?");
        endereço = sc.nextLine();
        System.out.println("me diga sua idade");
        idade = sc.nextInt();


        System.out.println("Seu nome,endereço e idade em sequencia " + nome + " " + endereço  + " " + idade);

    }
}
