/*
     6. Declare uma variável do tipo double precoOriginal.
     Atribua um valor em reais a essa variável,
     representando o preço original de um produto.
     Em seguida, declare uma variável do tipo double percentualDesconto
     e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
     Calcule o valor do desconto em reais, aplique-o ao preço original
     e imprima o novo preço com desconto.
 */

package desafios;

public class Produto2 {
    double precoOriginal, percentualDesconto;

    public static void main(String[] args) {
        Produto2 produto = new Produto2();
        produto.precoOriginal = 72.00;
        produto.percentualDesconto = 15 / 100.0;

        double precoComDesconto = produto.precoOriginal - (produto.percentualDesconto * produto.precoOriginal);

        System.out.println("""
                Preço Original: R$%.2f
                Desconto: %.0f%%
                Preço com Desconto: R$%.2f
                """.formatted(produto.precoOriginal, produto.percentualDesconto*100, precoComDesconto));
    }
}
