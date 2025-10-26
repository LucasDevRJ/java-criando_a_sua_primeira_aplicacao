package exercicios;

import java.util.Scanner;

public class ConversorDeTemperaturas {

    double celsius;

    public double converterCelsiusParaFahrenheit() {
        double fahrenheit = celsius * 1.8 + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        ConversorDeTemperaturas conversor = new ConversorDeTemperaturas();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor em Celsius: ");
        conversor.celsius = entrada.nextDouble();

        double fahrenheit = conversor.converterCelsiusParaFahrenheit();

        System.out.println(String.format("O valor %.2f°C convertido em Fahrenheit é %.2f°F.",
                conversor.celsius, fahrenheit));

        int fahrenheitDoTipoInteiro = (int) fahrenheit;

        System.out.printf("Farenheit somente com o valor inteiro = %d°F", fahrenheitDoTipoInteiro);

        entrada.close();
    }
}
