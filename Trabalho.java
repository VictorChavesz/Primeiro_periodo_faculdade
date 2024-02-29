import java.util.Scanner;

public class Trabalho {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] somaLinha = new int[3];
        int[] somaColuna = new int[3];
        int somaDiagonal = 0, somaDiagonalSecundaria = 0;
        boolean proximoJogador = true, vencedor = false;

        System.out.println("Sendo X=3 e O=10  jogador 1 é o X e o segundo Jogador e o O");

        for (int i = 0; i < matriz.length * matriz[0].length; i++) {
            int jogador = proximoJogador ? 3 : 10;
            String jogadorNome = proximoJogador ? "X" : "O";

            System.out.println("Vez do jogador " + jogadorNome);

            int posicaoX, posicaoY;
            do {
                System.out.println("Indique a posicao X (0-2):");
                posicaoX = ler.nextInt();

                System.out.println("Indique a posicao Y (0-2):");
                posicaoY = ler.nextInt();

                if (posicaoX >= 0 && posicaoX < 3 && posicaoY >= 0 && posicaoY < 3 && matriz[posicaoX][posicaoY] == 0) {
                    break;
                } else {
                    System.out.println("Posicao invalida, tente novamente.");
                }
            } while (true);

            matriz[posicaoX][posicaoY] = jogador;

            somaLinha[posicaoX] += jogador;
            somaColuna[posicaoY] += jogador;
            if (posicaoX == posicaoY) {
                somaDiagonal += jogador;
            }
            if (posicaoX + posicaoY == 2) {
                somaDiagonalSecundaria += jogador;
            }

            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    System.out.printf(" %2d ", matriz[x][y]);
                }
                System.out.println();
            }

            if (somaDiagonal == 9 || somaDiagonalSecundaria == 9 || somaLinha[posicaoX] == 9 || somaColuna[posicaoY] == 90) {
                System.out.println("Jogador X venceu!");
                vencedor = true;
                break;
            } else if (somaDiagonal == 30 || somaDiagonalSecundaria == 30 || somaLinha[posicaoX] == 30 || somaColuna[posicaoY] == 30) {
                System.out.println("Jogador O venceu!");
                vencedor = true;
                break;
            }

            proximoJogador = !proximoJogador;
        }

        if (!vencedor) {
            System.out.println("EMPATE");
        }
    }
}
