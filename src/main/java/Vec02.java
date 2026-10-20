import java.util.Scanner;

public class Vec02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] predio = {
                "Dr. Silva, Dentista",
                "Contabilidade Silva",
                "Dr. Silva, Cardiologista",
                "Silvana Silva, Manicure",
                "Silva & Silva Advogados Associados"
        };

        System.out.print("Digite o número do escritório (101 a 105): ");
        int escritorio = teclado.nextInt();

        if (escritorio >= 101 && escritorio <= 105) {
            // Se resta 101 al número para obtener la posición exacta en el array (0 a 4)
            int sala = escritorio - 101;
            System.out.println("A empresa localizada na sala " + escritorio + " é: " + predio[sala]);
        } else {
            System.out.println("Erro: A sala " + escritorio + " não existe neste prédio.");
        }

        teclado.close();
    }
}