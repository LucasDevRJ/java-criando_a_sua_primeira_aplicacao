/*
    2. Declare uma variável do tipo double e uma variável do tipo int.
     Faça o casting da variável double para int e imprima o resultado.
 */

package desafios;

public class Casting {
    public static void main(String[] args) {
        double a = 4.7;
        int b;

        b = (int) a;

        System.out.println("Variável a com número decimal = " + a);
        System.out.println("Variável a somente com número inteiro = " + b);
    }
}
