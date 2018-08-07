package Geometria_Computacional;

import java.text.DecimalFormat;
import java.util.Scanner;

import Funcoes_Comuns.LerValores;

public class Geom2518 {

	public static void main(String[] args) {
		LerValores ler = new LerValores();
		Scanner s = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("0.0000");
		
		while (s.hasNext()) {
			int qtdeDegraus = ler.lerValoresInt(s, 1, 1000);
			int H = ler.lerValoresInt(s, 1, 100);
			int C = ler.lerValoresInt(s, 1, 100);
			int L = ler.lerValoresInt(s, 1, 100);
			
			double hipotenusa = Math.sqrt(Math.pow(H, 2) + Math.pow(C, 2));
			double area = ((hipotenusa * qtdeDegraus) * L) / 10000;
			
			System.out.println(f.format(area).replace(',', '.') + " m²");	
		}
	}

}
