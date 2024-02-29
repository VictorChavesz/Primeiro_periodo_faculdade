public class AtividadeRevisao4 {
    public static void main(String[] args) {
        int[][] matriz = new int[8][8];

        for(int i = 0 ; i < 8 ; i++){
            for(int j = 0 ; j < 8 ; j++){
                matriz[i][j]=(int)(Math.random()*10);
                if(i%2==0 && j%2==0){
                    System.out.printf("posicoes onde os indices i e j são pares o valor é %d\n ",matriz[i][j]);
                }
            }
        }
    }
}
