package questoes;

import java.util.Scanner;

public class Q5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Informe uma nota entre 0 e 10: ");
            nota = scanner.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido. Tente novamente.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Valor válido: " + nota);
        scanner.close();
    }
}
