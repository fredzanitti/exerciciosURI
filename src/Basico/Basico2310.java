package Basico;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Basico2310 {

	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		
		int qtdeJog = digitarNumero(s, 0, 100);
		double TS = 0;
		double TB = 0;
		double TA = 0;
		int TS1 = 0;
		int TB1 = 0;
		int TA1 = 0;		
		
		for (int i = 0; i < qtdeJog; i++) {
			int S = digitarNumero(s, 1, 10000);
			int B = digitarNumero(s, 1, 10000);
			int A = digitarNumero(s, 1, 10000);
			int S1 = digitarNumero(s, 0, S);
			int B1 = digitarNumero(s, 0, B);
			int A1 = digitarNumero(s, 0, A);
			TS = TS + S;
			TB = TB + B;
			TA = TA + A;
			TS1 = TS1 + S1;
			TB1 = TB1 + B1;
			TA1 = TA1 + A1;			
		}

		System.out.println("Pontos de Saque: " + transfPercent(TS1, TS));
		System.out.println("Pontos de Bloqueio: " + transfPercent(TB1, TB));
		System.out.println("Pontos de Ataque: " + transfPercent(TA1, TA));
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
	
	private static String transfPercent(int divid, double divis){
		DecimalFormat f = new DecimalFormat("0.00");
		double percentual = (divid / divis) * 100; 
		
		return f.format(percentual).replace(",", ".") + " %.";
	}
}
