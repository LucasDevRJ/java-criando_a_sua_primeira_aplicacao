/*
    5. Declare uma variável do tipo double valorEmDolares.
    Atribua um valor em dólares a essa variável.
     Considere que o valor de 1 dólar é equivalente a 4.94 reais.
     Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
 */

package desafios;

public class Conversao {
    double valorEmDolares;

    public static void main(String[] args) {
        Conversao conversor = new Conversao();
        conversor.valorEmDolares = 120.00;

        double cotacao = 4.94;
        double conversao = conversor.valorEmDolares * cotacao;

        System.out.printf("O valor de %.2f dólares equivale a %.2f reais",
                conversor.valorEmDolares, conversao);
    }
}
