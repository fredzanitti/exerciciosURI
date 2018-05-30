package Basico;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Basico2757 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("0000000000");
		
		int v1 = digitarNumero(s, -10000, 10000);
		int v2 = digitarNumero(s, 0, 99);
		int v3 = digitarNumero(s, 0, 999);
		
		System.out.println("A = " + v1 + ", B = " + v2 + ", C = " + v3);
		System.out.println("A = " + forNumEspBranco(v1,'D') + ", B = " + forNumEspBranco(v2,'D') + ", C = " + forNumEspBranco(v3,'D'));
		System.out.println("A = " + f.format(v1) + ", B = " + f.format(v2) + ", C = " + f.format(v3));
		System.out.println("A = " + forNumEspBranco(v1,'E') + ", B = " + forNumEspBranco(v2,'E') + ", C = " + forNumEspBranco(v3,'E'));
	}
	
	private static int digitarNumero(Scanner s, int min, int max) {
		int x = s.nextInt();
		while ((x < min) || (x > max)) {
			x = s.nextInt();	
		}
		return x;
	}
	
	private static String forNumEspBranco(int valor, char lado){
		StringBuilder linha = new StringBuilder();
		String v = String.valueOf(valor);
		int tam;
		if (valor < 0) {
			tam = 9 - v.length();
		} else {
			tam = 10 - v.length();
		}
		
		if (lado == 'D') {
			for (int i = 0; i < tam; i++) {
				linha.append(" ");
			}
			linha.append(v);
		} else {
			linha.append(v);
			for (int i = 0; i < tam; i++) {
				linha.append(" ");
			}			
		}
		
		v = String.valueOf(linha);
		
		return v;		
	}
}