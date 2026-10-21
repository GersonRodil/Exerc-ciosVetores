import java.util.Scanner;

public class Vec03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantas notas deseja inserir: ");
        int quantidadeNotas = scanner.nextInt();

        double[] notas = new double[quantidadeNotas];

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        System.out.println("\n--- Resumo das Notas ---");
        double soma = 0;

        // Imprimir o resumo e somar
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
            soma += notas[i];
        }

        // Calcular a média final
        double media = soma / quantidadeNotas;
        System.out.println("A média final é: " + media);

        scanner.close();
    }
}