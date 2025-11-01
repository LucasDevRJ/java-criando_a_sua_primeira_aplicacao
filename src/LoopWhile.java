import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        double nota = 0.0;
        double media = 0.0;
        int totalDeNotas = 0;

        Scanner leitura = new Scanner(System.in);

        while (nota > -1) {
            System.out.print("Digite a sua nota (0-10) para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();
            if (nota >= 0) {
                media += nota;
                totalDeNotas++;
            }
        }

        media = media / totalDeNotas;
        System.out.printf("Média de avaliações = %.2f", media);
    }
}
