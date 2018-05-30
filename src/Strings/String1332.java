package Strings;

import java.util.Scanner;

public class String1332 {

	private static final Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int qtde = s.nextInt();
		String num = null;
		for (int i = 0; i < qtde; i++) {
			num = s.next();
			System.out.println("teste: " + verificaNumero(num));
		}
	}

	public static int verificaNumero(String n) {
		StringBuilder nome = new StringBuilder();
		nome.append(n);
		int numero = 0;

		if (nome.length() == 3) {
			if ((nome.charAt(0) == 'o') && (nome.charAt(1) == 'n') || 
				(nome.charAt(0) == 'o') && (nome.charAt(2) == 'e') ||
				(nome.charAt(1) == 'n') && (nome.charAt(2) == 'e')) {
				numero = 1;
			}

			if (nome.length() == 3) {
				if ((nome.charAt(0) == 't') && (nome.charAt(1) == 'w') ||
					(nome.charAt(0) == 't') && (nome.charAt(2) == 'o') ||
					(nome.charAt(1) == 'w') && (nome.charAt(2) == 'o')) {
					numero = 1;
				}
			}

		}
		return numero;
	}
}
