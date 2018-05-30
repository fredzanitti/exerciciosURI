package Basico;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Basico2029 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("0.00");
		
		double dia = 0;
		double vol = 0;
		double alt = 0;
		double are = 0;
		
		while (s.hasNext()) {
			vol = digitarNumero(s, 1, 10000);
			dia = digitarNumero(s, 1, 100);
			are = calculaAreaCirc(dia);
			alt = vol / are;
			System.out.println("ALTURA = " + f.format(alt).replace(",", "."));
			System.out.println("AREA = " + f.format(are).replace(",", "."));
		}
	}

	private static double digitarNumero(Scanner s, double min, double max) {
		double x = s.nextDouble();
		while ((x < min) || (x > max)) {
			x = s.nextDouble();	
		}
		return x;
	}

	private static double calculaAreaCirc(double d) {
		double ac = 3.14 * (Math.pow(d/2, 2));
		return ac;
	}

}
