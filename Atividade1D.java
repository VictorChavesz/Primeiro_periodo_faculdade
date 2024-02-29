public class Atividade1D {
    public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					matriz[i][j] = 2;
					System.out.print(matriz[i][j] + " ");
				}
				else if (i >= 0 && (j >= i+1)) {
					matriz[i][j] = 3;
					System.out.print(matriz[i][j] + " ");
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
