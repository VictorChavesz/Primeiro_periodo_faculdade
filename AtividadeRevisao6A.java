public class AtividadeRevisao6A {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int contador=5;
        
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 5 ; j++){
                if(i%2==0){
                matriz[i][j]=j+1;
                }else{
                    matriz[i][j]=contador;
                    contador--;
                }
                System.out.printf(" %d ",matriz[i][j]);
            }
            System.out.println();
            contador=5;
        }
    }
}
