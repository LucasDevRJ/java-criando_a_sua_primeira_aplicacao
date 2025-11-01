/*
    1. Crie um programa que solicite ao usuário digitar um número.
    Se o número for positivo, exiba "Número positivo", caso contrário,
    exiba "Número negativo".
 */

package desafios;

import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("Número digitado é um número positivo.");
        } else if (numero == 0) {
            System.out.println("Número digitado é um número neutro.");
        } else {
            System.out.println("Número digitado é um número negativo.");
        }

        entrada.close();
    }
}
