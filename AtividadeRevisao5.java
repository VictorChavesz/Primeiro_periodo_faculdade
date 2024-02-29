public class AtividadeRevisao5 {
    public static void main(String[] args) {
        int[][] matriz = new int[6][6];
        int contadorDiagonal=5, somaDiagPrincp=0,somaDiagSec=0;

        for(int i = 0; i < 6 ; i++){
            for(int j = 0 ; j < 6 ; j++){
                matriz[i][j]=(int)(Math.random()*10);
                System.out.printf(" %d ", matriz[i][j]);
                if(i==j){
                    somaDiagPrincp+=matriz[i][j];
                }else if(j==contadorDiagonal){
                    somaDiagSec+=matriz[i][j];
                    contadorDiagonal--;
                }
            }
            System.out.println();
        }
        System.out.println("_______");
        System.out.printf("a soma da diagonal principal é %d e da diagonal secundaria é %d",somaDiagPrincp,somaDiagSec);
    }
}
