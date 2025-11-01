/**
 * 2. Peça ao usuário para inserir dois números inteiros.
 * Compare os números e imprima uma mensagem indicando se são iguais,
 * diferentes, o primeiro é maior ou o segundo é maior.
 */
package desafios;

import java.util.Scanner;

public class DoisNumeros {
    public static void main(String[] args) {
        int numero1, numero2;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        numero1 = entrada.nextInt();

        System.out.print("Digite outro número inteiro: ");
        numero2 = entrada.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os dois números são iguais.");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior que o segundo.");
        } else {
            System.out.println("O segundo número é maior que o primeiro.");
        }

        entrada.close();
    }
}
