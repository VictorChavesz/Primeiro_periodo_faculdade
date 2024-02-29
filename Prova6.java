public class Prova6 {
    public static void main(String[] args) {
        int tamanho=15;
        String[][] matriz = new String[tamanho][tamanho];
        int resultado,x=0,y=0,r=8,a=7,b=7;

        for(int i = 0 ; i < tamanho ; i++ ){
            for(int j = 0 ; j < tamanho ; j++){
                x=j;
                y=i;
                resultado=(x*x)+(y*y)-(2*a*x)-(2*b*y)+(a*a)+(b*b)-(r*r);
                if(resultado==0 || resultado<0){
                    matriz[i][j]="*";
                    System.out.printf(" %s ",matriz[i][j]);
                }else{
                    matriz[i][j]=".";
                    System.out.printf(" %s ",matriz[i][j]);
                }
            }
            System.out.println();
        }
    }
}
