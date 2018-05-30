package Basico;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Basico1188 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("0.0");
		double soma = 0;
		double cont = 0;
		int cres = 0;
		int decr = 11;
		String op = s.next();
		
		int tam = 12;
		double[][] m = new double[tam][tam];

		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				m[i][j] = s.nextDouble();
			}			
		}

		for (int i = (tam - 1); i >= 0; i--) {
			for (int j = 0; j < tam; j++) {
				if ((j > cres) && (j < decr)) {
					soma = soma + m[i][j];
					cont++;
				}
			}
			cres++;
			decr--;
			
			if ((decr - cres) == 1) {
				if (op.equals("S")) {
					System.out.println(f.format(soma).replace(",", "."));
				} else {
					System.out.println(f.format(soma/cont).replace(",", "."));
				}
				break;
			}
		}
		s.close();
	}
}
