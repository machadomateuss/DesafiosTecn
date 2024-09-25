import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase para inverter: ");
        String original = scanner.nextLine();

        String invertida = inverterString(original);

        System.out.println("Palavra ou frase invertida: " + invertida);

        scanner.close();
    }

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {

            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;


            inicio++;
            fim--;
        }

        return new String(caracteres);
    }
}
