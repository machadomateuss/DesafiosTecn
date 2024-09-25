import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de dias no mês: ");
        int numDias = scanner.nextInt();

        double[] faturamento = new double[numDias];
        double soma = 0;

        for (int i = 0; i < numDias; i++) {
            System.out.print("Digite o faturamento do dia " + (i + 1) + " --> ");
            faturamento[i] = scanner.nextDouble();
            soma += faturamento[i];
        }

        double menorFaturamento = faturamento[0];
        double maiorFaturamento = faturamento[0];
        for (int i = 1; i < numDias; i++) {
            if (faturamento[i] < menorFaturamento) {
                menorFaturamento = faturamento[i];
            }
            if (faturamento[i] > maiorFaturamento) {
                maiorFaturamento = faturamento[i];
            }
        }

        double mediaMensal = soma / numDias;

        int diasAcimaDaMedia = 0;
        for (double valor : faturamento) {
            if (valor > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("\nMenor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);

        scanner.close();
    }
}
