package Basico;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Basico1435 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int ordem = s.nextInt();
		int[][] m = new int[ordem][ordem];
		
		while (ordem != 0) {
			m = new int[ordem][ordem];
			
			for (int i = 0; i < ordem; i++) {
				for (int j = 0; j < ordem; j++) {
					m[i][j] = 5;
				}				
			}
			
			imprimeMatriz(m, ordem);
			ordem = s.nextInt();						
		}
		s.close();
	}
	
	public static void imprimeMatriz(int[][] mt, int tam){
		DecimalFormat f = new DecimalFormat("000");
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				
				if (j == (tam-1)) {
					System.out.print(f.format(mt[i][j]));
				} else {
					System.out.print(mt[i][j] + "  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
