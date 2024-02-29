import java.util.Scanner;

public class QuestaoR1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string (no máximo 10 letras): ");
        String input = scanner.nextLine();

        char[] vetor = new char[10];

        for (int i = 0; i < 10; i++) {
            vetor[i] = '.';
        }

        for (int i = 0; i < input.length(); i++) {
            if (i < 10) {
                vetor[i] = input.charAt(i);
            } else {
                break;
            }
        }

        System.out.print("Vetor resultante: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i]);
        }

        scanner.close();
    }
}
