import java.util.Scanner;
public class Prova4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho = 5;
        char[][] matriz = new char[tamanho][tamanho];
        int contadorVogais=0,contadorConsoante=0;

        for(int i = 0 ; i < tamanho; i++){
            for(int j = 0 ; j < tamanho ; j++){
                System.out.println("Digite uma letra");
                matriz[i][j]=ler.next().charAt(0);
                if(matriz[i][j]=='a' || matriz[i][j]=='e' || matriz[i][j]=='i' || matriz[i][j]=='o' || matriz[i][j]=='u' ){
                    contadorVogais++;
                }else{
                    contadorConsoante++;
                }
            }
        }
        for(int i = 0 ; i < tamanho ; i++){
            for(int j = 0 ; j < tamanho ; j++){
                System.out.printf(" %c ", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.printf("\n %d consoantes e %d vogais",contadorConsoante,contadorVogais);
    }
}
