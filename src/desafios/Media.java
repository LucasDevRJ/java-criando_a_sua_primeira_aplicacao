//1. Crie um programa que realize a média de duas notas decimais e exiba o resultado.

package desafios;

import java.util.Scanner;

public class Media {

    public double calculaMedia(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;
        return media;
    }

    public static void main(String[] args) {
        Scanner entradaDeDados = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double primeiraNota = entradaDeDados.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double segundaNota = entradaDeDados.nextDouble();

        double mediaCalculada = new Media().calculaMedia(primeiraNota, segundaNota);

        System.out.printf("A média das notas %.2f e %.2f é %.2f",
                primeiraNota, segundaNota, mediaCalculada);

        entradaDeDados.close();
    }
}
