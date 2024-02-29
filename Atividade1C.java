public class Atividade1C {
    public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		int cont = 4;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2 && j == 2) {
					matriz[i][j] = 2;
					System.out.print(matriz[i][j] + " ");
				}
				else if (i == j) {
					matriz[i][j] = 0;
					System.out.print(matriz[i][j] + " ");
				}
				else if (j == cont) {
					matriz[i][j] = 0;
					System.out.print(matriz[i][j] + " ");
					cont--;
				}
				else if (j-1 == cont) {
					matriz[i][j] = 1;
					System.out.print(matriz[i][j] + " ");
					cont--;
				}
				else {
					matriz[i][j] = 1;
					System.out.print(matriz[i][j] + " ");
				}
			}
			System.out.println();
		}

	}
}
