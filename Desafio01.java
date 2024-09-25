public class Desafio01 {
    public static void main(String[] args) {
        int indice = 13, soma = 0, K = 0;
        
        while (K < indice) {
            K = K + 1;
            soma = soma + K;
        }
        
        System.out.println("O valor da SOMA é: " + soma);
    }
}