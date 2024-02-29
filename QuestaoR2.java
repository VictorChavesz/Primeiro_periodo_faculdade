import java.util.Random;
import java.util.Scanner;

public class QuestaoR2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[][] matriz = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (char) (random.nextInt(26) + 'a');
            }
        }

        System.out.println("Matriz gerada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == letra) {
                    count++;
                }
            }
        }

        System.out.println("A letra '" + letra + "' aparece " + count + " vezes na matriz.");

        scanner.close();
    }
}
