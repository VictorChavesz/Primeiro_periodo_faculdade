public class AtividadeRevisao6D {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int contador = 4;

        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5 ; j++){
                if(i==j){
                    matriz[i][j]=0;
                }else if(j==2 || i==2){
                    matriz[i][j]=3;
                }else if(j==contador){
                    matriz[i][j]=0;
                    contador--;
                }else {
                    matriz[i][j]=1;
                }if(j==contador){
                    matriz[i][j]=0;
                    contador--;
                }
                System.out.printf(" %d ",matriz[i][j]);
            }
            System.out.println();
        }
    }
}
