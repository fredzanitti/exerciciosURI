package Basico;
import java.util.Scanner;

public class Basico2057 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int S = digitarNumero(s, 0, 23);
		int T = digitarNumero(s, 1, 12);
		int F = digitarNumero(s, -5, 5);
		
		int chegada = S + T + F;
		if (chegada >= 24) {
			chegada = chegada - 24;
		} else if (chegada < 0) {
			chegada = 24 + chegada;
		}
		System.out.println(chegada);
		
		
	}

	private static int digitarNumero(Scanner s, int min, int max) {
		int x = s.nextInt();
		while ((x < min) || (x > max)) {
			x = s.nextInt();	
		}
		return x;
	}
}
