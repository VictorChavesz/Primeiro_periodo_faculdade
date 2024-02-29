public class AtividadeRevisao3 {
    public static void main(String[] args) {
        int[] vetorA = {1,5,9,0,4};
        int[] vetorB = {2,3,7,6,8};
        int[] vetorC = new int[5];

        for(int i = 0 ; i < 5 ; i++){
            if(i%2==0){
                vetorC[i]=vetorA[i];
            }else{
            vetorC[i]=vetorB[i];
            }
        }
        for(int i : vetorC){
            System.out.println(i);
        }
    }
}
