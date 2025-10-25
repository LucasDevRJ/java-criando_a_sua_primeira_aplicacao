/**
 * 1. Crie um projeto Java no IntelliJ que deve conter uma classe chamada Perfil,
 * com o método main, que ao executar deverá imprimir um cumprimento personalizado no console.
 * Por exemplo, "Olá, [Seu Nome]!".
 *
 * 2. Modifique o programa para imprimir uma segunda mensagem de cumprimento personalizada.
 * Por exemplo, "Tudo bem?".
 */

package desafios;

import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.printf("\nOlá, %s!\n", nome);
        System.out.println("Tudo bem?");
    }
}
