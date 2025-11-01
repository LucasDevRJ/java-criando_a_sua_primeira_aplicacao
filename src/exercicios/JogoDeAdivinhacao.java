package exercicios;

import java.util.Random;
import java.util.Scanner;

/*
    Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100
    e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa,
    o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.
 */
public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        int numeroGerado = new Random().nextInt(100);
        int numeroDeTentativas = 5;
        int numeroChutado = -1;
        String informacoes = """
                --------------------|JOGO DE ADIVINHAÇÃO|--------------------
                Tente adivinhar um número inteiro dentre 0 a 100.
                Você tem 5 tentativas.
                """;

        Scanner entrada = new Scanner(System.in);

        System.out.println(informacoes);

        while (numeroGerado != numeroChutado && numeroDeTentativas > 0) {
            System.out.print("Digite um número de 0 a 100: ");
            numeroChutado = entrada.nextInt();
            numeroDeTentativas--;

            if (numeroGerado == numeroChutado) {
                break;
            }

            String mensagemSobreTentativas = numeroDeTentativas > 1 ? "Restam %d tentativas.".formatted(numeroDeTentativas)
                    : "Resta %d tentativa.".formatted(numeroDeTentativas);
            if (numeroDeTentativas > 0) {
                System.out.printf("\n%s\n", mensagemSobreTentativas);
            }
        }

        System.out.println();
        if (numeroGerado == numeroChutado) {
            System.out.println("Parabéns! Você acertou o número.");
        } else {
            System.out.println("Infelizmente você não acertou o número gerado.");
        }

        System.out.println("O número gerado era " + numeroGerado);
        System.out.println("--------------------|FIM DO JOGO|--------------------");

        entrada.close();
    }
}
