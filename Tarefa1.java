public class Tarefa1 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

       System.out.println("aaaa");
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(i<j){
                    matriz[i][j]=(2*i)+(7*j)-2;
                    System.out.printf(" %d ",matriz[i][j]);
                }else if(i==j){
                    matriz[i][j]=(3*(i*i))-1;
                    System.out.printf(" %d ",matriz[i][j]);
                }else{
                    matriz[i][j]=(4*(i*i*i))-(5*(j*j))+1;
                    System.out.printf(" %d ",matriz[i][j]);
                }
            }
            System.out.println();
        }
    }
}
