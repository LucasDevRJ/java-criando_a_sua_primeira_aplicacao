/*
    3. Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
     Atribua valores a essas variáveis e concatene-as em uma mensagem.
 */
package desafios;

public class Concatenacao {
    char letra;
    String palavra;

    public static void main(String[] args) {
        Concatenacao concatenacao = new Concatenacao();
        concatenacao.letra = 'L';
        concatenacao.palavra = """
                O nome 'Lucas' começa com %s.
                """.formatted(concatenacao.letra);

        System.out.println(concatenacao.palavra);
    }
}
