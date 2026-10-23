import java.util.Scanner;

public class Vec05 {
    public static void main(String[] args) {
        int[] limites = {0, 55, 65, 75, 85, 100};
        String[] categorias = {"pena", "leve", "médio", "meio-pesado", "pesado", "super-pesado"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso do lutador em kg: ");
        double pesoDigitado = scanner.nextDouble();

        String categoriaAtual = "";

        for (int i = limites.length - 1; i >= 0; i--) {
            if (pesoDigitado >= limites[i]) {
                categoriaAtual = categorias[i];
                break;
            }
        }

        System.out.println("A categoria do lutador é: " + categoriaAtual);

        scanner.close();
    }
}