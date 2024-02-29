import java.util.Scanner;
public class Atividade12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float peso=0,altura=0,IMC=0;

        System.out.println("Digite o seu peso em kg");
        peso=ler.nextFloat();

        System.out.println("Digite sua altuma em m");
        altura=ler.nextFloat();

        IMC=peso/(altura*altura);

        System.out.printf("seu IMC é: %f",IMC);
    }
}
