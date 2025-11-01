/*
    4. Crie um programa que solicite ao usuário um número
    e exiba a tabuada desse número de 1 a 10.
 */

package desafios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            int tabuada = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, tabuada);
        }

        entrada.close();
    }
}
