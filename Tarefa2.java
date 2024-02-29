public class Tarefa2 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[] vetor = new int[16];
        int menor = 999;
        int posicaoJ=0;
        int posicaoK=0;

        System.out.println("matriz aleatoria");

        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                matriz[i][j]=(int)(Math.random()*100);
                System.out.printf(" %d ", matriz[i][j]);
            }
            System.out.println();
        }
        for(int i = 0 ; i < 16 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                for(int k = 0 ; k < 4 ; k++){
                    if(matriz[j][k]<menor){
                    menor=matriz[j][k];
                    posicaoJ = j;
                    posicaoK = k;
                    }
                }    
            }
            vetor[i]=menor;
            menor = 999;
            matriz[posicaoJ][posicaoK]=999999;
        }
        
        System.out.println("ordem crescente");

        for(int i : vetor){
            System.out.printf(" %d ",i);
        }
        
        System.out.println();

        System.out.println("matriz ordenada");
        for(int i = 0; i < 16; i++){
            for(int j = 0; j < 4 ; j ++){
                for(int k = 0 ; k < 4 ; k++){
                    matriz[j][k]=vetor[i];
                    i++;
                    System.out.printf(" %d ",matriz[j][k]);
                }
                System.out.println();
            }
        }
    }
}
