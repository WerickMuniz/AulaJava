package AulaJava.Exercicio;

import java.util.Scanner;

public class ex04 {

    // Informe a média do aluno (7) e mostre se ele está reprovado ou aprovado. São
    // 3 notas.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1, nota2 , nota3 ;

        System.out.println("quais sao suas 3 notas ? ");

        nota1 = sc.nextInt();
        nota2 = sc.nextInt();
        nota3 = sc.nextInt();

        int resultado1 = nota1 + nota2 + nota3;
        int resultado2 = resultado1 / 3;

        System.out.println("Sua média é " + resultado2);

        if (resultado2 >= 7) {System.out.println("Parabéns,você esta aprovado");
            
        } else {System.out.println("Você está reprovado,vagabundo");
            
        }
         
    }

}
