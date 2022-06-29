package AulaJava.Exercicio;

import java.util.Scanner;

public class ex02 {
    // Peça para o usuario inserir dois numeros e comparar se o primeiro é maior do
    // que o segundo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("escolha o primeiro numero");
        numero1 = sc.nextInt();
        System.out.println("escolha o segundo numero");
        numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1 + " é maior que o " + numero2);

        } else if (numero2 > numero1) {
            System.out.println(numero1 + " é menor que o " + numero2);

        } else {
            System.out.println(numero1 + " é igual ao " + numero2);
        }

    }
}
