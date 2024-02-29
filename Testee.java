public class Testee {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for(int i = 0 ; i < 5 ; i++){
            matriz[i][0]=1;
            matriz[i][i]=1;

            for(int j = 1; j < i; j++){
                matriz[i][j]=matriz[i-1][j-1]+matriz[i-1][j];
            }

        }
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0; j < 5; j++){
                System.out.printf(" %d ",matriz[i][j]);
            }
            System.out.println();
        }
        
    }
}
