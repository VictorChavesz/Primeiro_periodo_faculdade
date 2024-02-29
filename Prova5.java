import java.util.Scanner;
public class Prova5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanhoLinha=0,tamanhoColuna=0;
        int[] vetor = new int[100];
        boolean condicao=false;
        int condicao2=0;

        for(int i = 0 ; i < 100;i++){
            vetor[i]=(int)(Math.random()*100);
            System.out.printf(" %d ",vetor[i]);
        }
        System.out.println();
        while(condicao=false || condicao2==0){
            System.out.println("Informe um numero de 1 a 10, ele sera o numero de linhas");
            tamanhoLinha=ler.nextInt();
            if(tamanhoLinha<1 || tamanhoLinha>10){
                System.out.println("Valor invalido");
                condicao=false;
            }else{
                condicao=true;
            }
            System.out.println("Infome um numero de 1 a 10, ele sera o numero de colunas");
            tamanhoColuna=ler.nextInt();
            if(tamanhoColuna < 1 || tamanhoColuna > 10){
                System.out.println("Valor invalido");
                condicao2=0;
            }else{
                condicao2=1;
            }
        }

        int[][] matriz = new int[tamanhoLinha][tamanhoColuna];
        
        for(int i = 0; i < 2 ; i++){
            for(int x = 0 ; x < tamanhoLinha ; x++){
                for(int y = 0 ; y < tamanhoColuna ; y++){
                    matriz[x][y]=vetor[i];
                    i++;
                    System.out.printf(" %d ", matriz[x][y]);
                }
                System.out.println();
            }
        }
    
    }
}

