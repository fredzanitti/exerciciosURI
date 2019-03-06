package Funcoes_Comuns;

import java.util.Scanner;

public class DigitarNumeros {
	public int digitarNumeroInteiros(Scanner s, int min, int max) {
		int x = s.nextInt();
		
		if (x == 0) {
			return x;
		}
		while ((x < min) || (x > max)) {
			x = s.nextInt();	
		}
		return x;		
	}

}
