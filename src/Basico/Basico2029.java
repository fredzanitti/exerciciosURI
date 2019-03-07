package Basico;
import java.text.DecimalFormat;
import java.util.Scanner;

import Funcoes_Comuns.DigitarNumeros;

public class Basico2029 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		DigitarNumeros digitar = new DigitarNumeros();
		DecimalFormat f = new DecimalFormat("0.00");
		
		double dia = 0;
		double vol = 0;
		double alt = 0;
		double are = 0;
		
		while (s.hasNext()) {
			vol = digitar.digitarNumeroInteiros(s, 1, 10000);
			dia = digitar.digitarNumeroInteiros(s, 1, 100);
			are = calculaAreaCirc(dia);
			alt = vol / are;
			System.out.println("ALTURA = " + f.format(alt).replace(",", "."));
			System.out.println("AREA = " + f.format(are).replace(",", "."));
		}
	}

	private static double calculaAreaCirc(double d) {
		double ac = 3.14 * (Math.pow(d/2, 2));
		return ac;
	}

}
