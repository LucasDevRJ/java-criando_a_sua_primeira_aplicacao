/*
    6. Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
 */

package desafios;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int numero, fatorial, fatorialDesejado;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        numero = entrada.nextInt();
        fatorialDesejado = numero;

        int antecessor = numero - 1;
        fatorial = 0;
        for (int i = antecessor; i > 0; i--) {
           fatorial = numero * i;
           numero = fatorial;
        }

        System.out.printf("%d! = %d", fatorialDesejado, fatorial);

        entrada.close();
    }
}
