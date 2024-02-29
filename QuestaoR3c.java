public class QuestaoR3c {
    public static void main(String[] args) {
        char[][] matriz = new char[5][5];

        for(int i = 0; i < 4; i++){
            for(int j = 0 ; j < 4; j++){
                if(i==j){
                    matriz[i][j]='*';
                    System.out.printf(" %c ", matriz[i][j]);
                }else if(i>j){
                     matriz[i][j]='*';
                     System.out.printf(" %c ", matriz[i][j]);
                }
            }
            System.out.println();
        }
    }
}
