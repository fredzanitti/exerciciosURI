package Basico;
import java.util.Scanner;

public class Basico2581 {
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		int qtde = digitarNumero(s, 0, 9999);
		for (int i = 0; i < qtde; i++) {
			System.out.println("I am Toorg!");
		}
		s.close();
		s1.close();
	}

	private static int digitarNumero(Scanner s, int min, int max) {
		int x = s.nextInt();

		while ((x < min) || (x > max)) {
			x = s.nextInt();
		}
		return x;
	}

}
