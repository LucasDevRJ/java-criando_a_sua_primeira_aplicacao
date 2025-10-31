/*
    Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
     Calcule o valor total multiplicando o preço do produto pela quantidade
     e apresente o resultado em uma mensagem.
 */

package desafios;

public class Produto {
    double precoProduto;
    int quantidade;

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.precoProduto = 50.00;
        produto.quantidade = 3;

        double valorTotal = produto.precoProduto * produto.quantidade;

        System.out.println("Valor total: R$" + valorTotal);
    }
}
