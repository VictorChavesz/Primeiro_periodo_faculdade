import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        
        System.out.println("Preencha a matriz 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextInt();
            }
        }
        
        int somaMagica = 0;
        for (int j = 0; j < matriz[0].length; j++) {
            somaMagica += matriz[0][j];
        }
        
        boolean ehQuadradoMagico = true;
        
        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }
            
            if (somaLinha != somaMagica || somaColuna != somaMagica) {
                ehQuadradoMagico = false;
                break;
            }
        }
        
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        
        if (somaDiagonalPrincipal != somaMagica) {
            ehQuadradoMagico = false;
        }
        
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonalSecundaria += matriz[i][matriz.length - 1 - i];
        }
        
        if (somaDiagonalSecundaria != somaMagica) {
            ehQuadradoMagico = false;
        }
        
        if (ehQuadradoMagico) {
            System.out.println("A matriz é um quadrado mágico.");
        } else {
            System.out.println("A matriz não é um quadrado mágico.");
        }
    }


}
