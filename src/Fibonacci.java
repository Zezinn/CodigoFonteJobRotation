import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número inteiro positivo: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int fib = 0;

        while (fib < n) {
            fib = a + b;
            a = b;
            b = fib;
        }

        if (fib == n) {
            System.out.println(n + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(n + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }
}
