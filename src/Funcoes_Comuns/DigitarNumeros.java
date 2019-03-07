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
	
	public double digitarNumDouble(Scanner s, Double min, Double max) {
		double x = s.nextDouble();
		while ((x < min) || (x > max)) {
			x = s.nextDouble();	
		}
		return x;
	}	

}
