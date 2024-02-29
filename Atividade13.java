import java.util.Scanner;
public class Atividade13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float nota1,peso1,nota2,peso2,nota3,peso3,mediaPonderada=0;

        System.out.println("Digite a primeira nota");
        nota1=ler.nextFloat();

        System.out.println("Digite o peso da primeira nota");
        peso1=ler.nextFloat();
        
        System.out.println("Digite a segunda nota");
        nota2=ler.nextFloat();

        System.out.println("Digite o peso da segunda nota");
        peso2=ler.nextFloat();

        System.out.println("Digite a terceira nota");
        nota3=ler.nextFloat();

        System.out.println("Digite o peso da terceira nota");
        peso3=ler.nextFloat();

        mediaPonderada=(nota1*peso1)+(nota2*peso2)+(nota3*peso3)/peso1+peso2+peso3;

        System.out.printf("A media ponderada é : %f",mediaPonderada);

    }
}
