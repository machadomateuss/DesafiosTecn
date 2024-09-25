import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
            int num = scanner.nextInt();

            if (Fibonacci(num)) {
                System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
            }

            System.out.print("Deseja continuar e verificar outro número? (s|n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        scanner.close();
        System.out.println("Encerrado.");
    }
    public static boolean Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        int a = 0;
        int b = 1;
        int c = a + b;

        while (c <= n) {
            if (c == n) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }

        return false;
    }
}
