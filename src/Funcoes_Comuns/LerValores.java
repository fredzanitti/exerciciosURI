package Funcoes_Comuns;

import java.util.Scanner;

public class LerValores {

	public static int lerValoresInt(Scanner entrada, int i, int j) {
		int x = entrada.nextInt();
		while ((x < i) || (x > j)) {
			x = entrada.nextInt();	
		}
		return x;
	}

}
