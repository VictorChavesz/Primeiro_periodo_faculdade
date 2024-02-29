public class Tarefa3 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][6];
        int[][] matrizMulti = new int[5][6];
        int[] somaLinha = new int[5];

        System.out.println("matriz aleatoria");
        for(int i = 0 ; i < 5; i ++){
            for(int j = 0 ; j < 6 ; j++){
                matriz[i][j]=(int)(Math.random()*10);
                somaLinha[i]+=matriz[i][j];
                System.out.printf(" %d ",matriz[i][j]);
            }
            System.out.println();
        }
        int a = 1;
        for(int i : somaLinha){
            System.out.printf("soma da linha %d e %d \n",a,i);
            a++;
        }

        System.out.println("matriz nova");

        for(int i = 0 ; i < 5; i ++){
            for(int j = 0 ; j < 6 ; j++){
                matriz[i][j]=(int)(Math.random()*10);
                matriz[i][j]=matriz[i][j]*somaLinha[i];
                System.out.printf(" %d ",matriz[i][j]);
            }
            System.out.println();
        }

    }
}
