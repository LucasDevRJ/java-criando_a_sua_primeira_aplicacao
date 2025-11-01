import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        double nota = 0.0;
        double media = 0.0;

        Scanner leitura = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a sua nota (0-10): ");
            nota = leitura.nextDouble();
            media += nota;
        }

        media = media / 3;
        System.out.printf("Média de avaliações = %.2f", media);
    }
}
