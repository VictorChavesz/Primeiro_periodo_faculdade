import java.util.Scanner;
public class Tarefa4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char[][] matriz = new char[5][10];
        int[] resultado = new int[5];
        char[] respostas = {'a','b','c','a','d','b','d','d','a','a'};
        int a=1,r=1;

            for(int i = 0; i < 5 ; i++){
                for(int j = 0; j < 10 ; j++){
                    System.out.printf("%d aluno resposta %d ",a,r);
                    matriz[i][j]=ler.next().charAt(0);
                    System.out.printf(" %c ",matriz[i][j]);
                    r++;
                }
                r=1;
                a++;
                System.out.println();
            }

            for(int i = 0; i < 5 ; i++){
                for(int j = 0; j < 10 ; j++){
                    System.out.printf(" %c ",matriz[i][j]);
                }
                System.out.println();
            }

            for(int i = 0 ; i < 5 ; i++){
                for(int j = 0; j < 10 ; j ++){
                    if(matriz[i][j]==respostas[j]){
                        resultado[i]+=1;
                    }
                }
            }

            for(int i : resultado ){
                System.out.println(i);
            }
    }
}
