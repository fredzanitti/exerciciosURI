package Basico;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Basico1118 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("0.00");
		
		int cont = 0;
		double x = 0;
		double soma = 0;
		int novo = 0;
		
		while (cont != 2) {
			x = s.nextDouble();
			if ((x < 0) || (x > 10)) {
				System.out.println("nota invalida");
			} else {
				soma = soma + x;
				cont++;
			}
			if (cont == 2) {
				System.out.println("media = " + f.format(soma/cont).replace(",", "."));
				System.out.println("novo calculo (1-sim 2-nao)");
				novo = s.nextInt();
				while ((novo < 1) || (novo > 2)) {
					System.out.println("novo calculo (1-sim 2-nao)");
					novo = s.nextInt();	
				}
				
				if (novo == 1) {
					cont = 0;
					soma = 0;
				}
			}
		}
		s.close();
	}

}
