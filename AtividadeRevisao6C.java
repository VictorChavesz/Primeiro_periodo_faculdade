public class AtividadeRevisao6C {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5 ; j++){
                if(i==0 || i==4 || j==0 || j==4){
                    matriz[i][j]=0;
                }else{
                    matriz[i][j]=1;
                }
                System.out.printf(" %d ",matriz[i][j]);
            }
            System.out.println();
        }
    }
}
