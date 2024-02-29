public class AtividadeRevisao6B {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int contador=4;

        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5 ; j++){
                if(i==j){
                    matriz[i][j]=1;
                }else if(j==contador){
                    matriz[i][j]=1;
                    contador--;
                }else{
                    matriz[i][j]=2;
                }
                System.out.printf(" %d ",matriz[i][j]);
            }
            System.out.println();
        }
    }
}
