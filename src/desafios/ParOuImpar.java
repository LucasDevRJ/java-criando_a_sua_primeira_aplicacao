/*
    Crie um programa que solicite ao usuário a entrada de um número inteiro.
    Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
 */
package desafios;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        int numero, resto;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        numero = entrada.nextInt();

        resto = numero % 2;

        if (resto == 0) {
            System.out.println("O número digitado é par.");
        } else {
            System.out.println("O número digitado é ímpar.");
        }

        entrada.close();
    }
}
