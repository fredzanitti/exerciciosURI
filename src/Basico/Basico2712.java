package Basico;
import java.util.Scanner;

public class Basico2712 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int qtde = digitarNumero(s, 0, 1000);
		String placa = "";

		for (int i = 0; i < qtde; i++) {
			placa = s.next();
			conferePlaca(placa);
		}
	}

	private static void conferePlaca(String pl) {
		String letra = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numero = "0123456789";

		if (!validaHifenPlaca(pl, letra, numero)) {
			System.out.println("FAILURE");
		} else {
			switch (pl.charAt(7)) {
			case '1':
				System.out.println("MONDAY");
				break;
			case '2':
				System.out.println("MONDAY");
				break;
			case '3':
				System.out.println("TUESDAY");
				break;
			case '4':
				System.out.println("TUESDAY");
				break;
			case '5':
				System.out.println("WEDNESDAY");
				break;
			case '6':
				System.out.println("WEDNESDAY");
				break;
			case '7':
				System.out.println("THURSDAY");
				break;
			case '8':
				System.out.println("THURSDAY");
				break;
			case '9':
				System.out.println("FRIDAY");
				break;
			case '0':
				System.out.println("FRIDAY");	
				break;				
			default:
				break;
			}
		}

	}

	private static boolean validaHifenPlaca(String pl, String letra, String numero) {
		if (pl.length() != 8) {
			return false;
		} else {
			if (pl.charAt(3) != '-') {
				return false;
			} else {
				if (!validaLetraPlaca(pl, letra)) {
					return false;
				}
				if (!validaNumerosPlaca(pl, numero)) {
					return false;
				}
			}
			return true;
		}
	}

	private static boolean validaLetraPlaca(String pl, String letra) {
		// valida letras da placa
		int cont = 0;
		for (int j = 0; j < letra.length(); j++) {
			if (pl.charAt(0) == letra.charAt(j)) {
				cont++;
			}
			if (pl.charAt(1) == letra.charAt(j)) {
				cont++;
			}
			if (pl.charAt(2) == letra.charAt(j)) {
				cont++;
			}
		}
		if (cont == 3) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean validaNumerosPlaca(String pl, String numero) {
		// valida números da placa
		int cont = 0;
		for (int j = 0; j < numero.length(); j++) {
			if (pl.charAt(4) == numero.charAt(j)) {
				cont++;
			}
			if (pl.charAt(5) == numero.charAt(j)) {
				cont++;
			}
			if (pl.charAt(6) == numero.charAt(j)) {
				cont++;
			}
			if (pl.charAt(7) == numero.charAt(j)) {
				cont++;
			}
		}
		if (cont == 4) {
			return true;
		} else {
			return false;
		}
	}

	private static int digitarNumero(Scanner s, int min, int max) {
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
