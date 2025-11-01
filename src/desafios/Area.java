/**
 * 3. Crie um menu que oferece duas opções ao usuário:
 * "1. Calcular área do quadrado" e
 * "2. Calcular área do círculo".
 * Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
 */

package desafios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        String menu = """
                --------------------|MENU|--------------------
                1 - Calcular área do quadrado
                2 - Calcular área do círculo
                ----------------------------------------------
                """;
        int opcao;
        double area;

        Scanner entrada = new Scanner(System.in);

        System.out.println(menu);
        System.out.print("Digite a opção desejada: ");
        opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o valor do lado: ");
                double lado = entrada.nextDouble();

                area = Math.pow(lado, 2);

                System.out.printf("\nA área do quadrado equivale a %.2fcm²", area);
                break;
            case 2:
                System.out.print("Digite o valor do raio: ");
                double raio = entrada.nextDouble();

                area = Math.PI * Math.pow(raio, 2);

                System.out.printf("\nA área do círculo equivale a %.2fcm²", area);
                break;

            default:
                System.out.println("Opção inválida.");
        }

        entrada.close();
    }
}
