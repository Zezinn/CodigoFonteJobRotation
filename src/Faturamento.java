import java.util.Scanner;

public class Faturamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de dias do mês: ");
        int n = sc.nextInt();

        double[] faturamento = new double[n];
        double soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Informe o faturamento do dia " + (i + 1) + ": ");
            faturamento[i] = sc.nextDouble();
            soma += faturamento[i];
        }

        double media = soma / n;
        int count = 0;
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (faturamento[i] > faturamento[maxIndex]) {
                maxIndex = i;
            }
            if (faturamento[i] < faturamento[minIndex]) {
                minIndex = i;
            }
            if (faturamento[i] > media) {
                count++;
            }
        }

        System.out.println("Menor faturamento diário: " + faturamento[minIndex]);
        System.out.println("Maior faturamento diário: " + faturamento[maxIndex]);
        System.out.println("Número de dias com faturamento superior à média: " + count);

        sc.close();
    }
}
