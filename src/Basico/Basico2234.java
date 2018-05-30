package Basico;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Basico2234 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("0.00");
		
		double h = digitarNumero(s, 1, 1000);
		double p = digitarNumero(s, 1, 1000);
		
		System.out.println(f.format(h/p).replace(",", "."));
		
	}
	
	private static int digitarNumero(Scanner s, int min, int max) {
		int x = s.nextInt();
		while ((x < min) || (x > max)) {
			x = s.nextInt();	
		}
		return x;
	}

}
