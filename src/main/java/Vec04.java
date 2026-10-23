import java.util.Scanner;

public class Vec04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Preparación
        String[] arcoiris = {"vermelho", "laranja", "amarelo", "verde", "azul", "anil", "roxo"};
        boolean[] coresEncontradas = new boolean[7];
        int acertos = 0;
        int erros = 0;

        System.out.println("Bem-vindo ao jogo do Arco-íris! Tente adivinhar as 7 cores.");

        // 2. Ciclo principal del juego
        while (acertos < 7) {
            System.out.print("\nDigite uma cor (ou 'desistir'): ");
            String corDigitada = scanner.nextLine().trim();

            // Opción de rendirse
            if (corDigitada.equalsIgnoreCase("desistir")) {
                System.out.println("Você desistiu do jogo. Até a próxima!");
                break;
            }

            // Variables bandera para este turno
            boolean corValida = false;
            boolean jaDigitada = false;

            // 3. Búsqueda en el arreglo
            for (int i = 0; i < arcoiris.length; i++) {
                if (arcoiris[i].equalsIgnoreCase(corDigitada)) {
                    corValida = true;

                    if (coresEncontradas[i]) {
                        jaDigitada = true;
                    } else {
                        coresEncontradas[i] = true;
                        acertos++;
                    }
                    break; // Detiene la búsqueda al encontrar el color
                }
            }

            // 4. Verificación y mensajes
            if (corValida) {
                if (jaDigitada) {
                    System.out.println("Atenção: Você já adivinhou a cor '" + corDigitada + "' antes. Tente outra!");
                } else {
                    System.out.println("Parabéns, acertou! A cor '" + corDigitada + "' faz parte do arco-íris.");
                }
            } else {
                System.out.println("Errou! '" + corDigitada + "' não está no arco-íris.");
                erros++;
            }

            // Marcador
            System.out.println("Placar -> Acertos: " + acertos + " | Erros: " + erros);
        }

        // Mensaje final si gana
        if (acertos == 7) {
            System.out.println("\n🎉 Você venceu! Encontrou todas as cores do arco-íris com " + erros + " erro(s).");
        }

        scanner.close();
    }
}