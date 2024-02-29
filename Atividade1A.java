public class Atividade1A {
    public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		int cont = 0;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					cont++;
					matriz[i][j] = cont;
					System.out.print(matriz[i][j] + " ");
				}
				else {
					if (i % 2 == 0) {
						matriz[i][j] = 9;
						System.out.print(matriz[i][j] + " ");
					}
					else {
						matriz[i][j] = 6;
						System.out.print(matriz[i][j] + " ");
					}
				}
			}
			System.out.println();
		}

	}
}
