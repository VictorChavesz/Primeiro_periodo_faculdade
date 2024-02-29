public class AtividadeRevisao1 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int soma=0,media;
        
        for(int i = 0 ; i < 10 ; i++){
            vetor[i]=(int)(Math.random()*100);
            soma+=vetor[i];
            System.out.println(vetor[i]);
        }
        media=soma/10;
        System.out.println("____________");
        System.out.println(media);
    }
}
