package AulaJava.Exercicio;

import java.util.Scanner;

public class ex05 {

    // Jogo da adivinhação, o usuário vai ter 3 tentativas para acertar a palavra.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String segredo = "dado";
        String resposta1, resposta2, resposta3;

        System.out.println(
                "Bem vindo ao jogo de advinhação,onde se você acertar a palavra escondida com 3 tentativas,voce ganhará a bolada de 1 milhao de reais,fale a sua primeira tentativa");
        resposta1 = sc.nextLine();
        if (resposta1.equals("dado")) {
            System.out.println("Você acertou,parabens");

        } else {
            System.out.println("Você errou,voce tem mais 2 tentativas");

            resposta2 = sc.nextLine();
            if (resposta2.equals("dado")) {
                System.out.println("Você acertou,parabens");

            } else {
                System.out.println("Você errou,voce tem mais 1 tentativas");

                resposta3 = sc.nextLine();
                if (resposta3.equals("dado")) {
                    System.out.println("Você acertou,parabens");

                } else {
                    System.out.println("Você errou,e acabou suas tent");

                }

            }
        }

    }

}
