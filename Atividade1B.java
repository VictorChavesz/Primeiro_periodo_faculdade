public class Atividade1B {
    public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		int cont = 0, cont2 = 4;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == cont2) {
					cont++;
					matriz[i][j] = cont;
					cont2--;
					System.out.print(matriz[i][j] + " ");
				}
				else {
					matriz[i][j] = 0;
					System.out.print(matriz[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
