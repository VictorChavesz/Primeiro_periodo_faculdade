public class AtividadeRevisao2 {
    public static void main(String[] args) {
        int[] vetorA = new int[15];
        int[] vetorB = new int[15];
        int[] vetorC = new int[vetorA.length+vetorB.length];
        
        for(int i = 0; i < 15 ; i++){
            vetorA[i]=(int)(Math.random()*10);
            vetorB[i]=(int)(Math.random()*10);
            System.out.printf("A %d e B %d\n",vetorA[i],vetorB[i]);
        }
        for(int i = 0 ; i < 15;i++){
            vetorC[i]=vetorA[i];
            vetorC[i+vetorA.length]=vetorB[i];
        }
        System.out.println("________");
        for(int i : vetorC){
            System.out.println(i);
        }
    }
}
