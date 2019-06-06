package Matematica;

import java.util.Scanner;

import Funcoes_Comuns.LerValores;
import Funcoes_Comuns.MaiorEntreTres;

public class matematica1555 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LerValores ler = new LerValores();
		MaiorEntreTres m = new MaiorEntreTres();
		
		System.out.print("Quantidade de testes: ");
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = ler.lerValoresInt(s, 1, 2147483647);
			int y = ler.lerValoresInt(s, 1, 100);
			
			int vlrR = formulaRafael(x, y);
			int vlrB = formulaBeto(x, y);
			int vlrC = formulaCarlos(x, y);
			
			if (vlrR == m.maiorDeTres(vlrR, vlrB, vlrC)) {
				System.out.println("Rafael GANHOU");
			} else {
				if (vlrB == m.maiorDeTres(vlrR, vlrB, vlrC)) {
					System.out.println("Beto GANHOU");
				} else {
					System.out.println("Carlos GANHOU");
				}
			}
		}

	}

	private static int formulaCarlos(int x, int y) {
		// -100x + y³
		
		int vlr = -100 * x + (int) Math.pow(y, 3);
		return vlr;
	}

	private static int formulaBeto(int x, int y) {
		// 2(x²) + (5y)²
		int vlr = (2 * (int) Math.pow(x, 2)) + (int) Math.pow(5*y, 2);		
		return vlr;
	}

	private static int formulaRafael(int x, int y) {
		// (3x)² + y²
		
		int vlr = (int) Math.pow(3*x, 2) + (int) Math.pow(y, 2);
		return vlr;
	}
	

}
