package Basico;
import java.util.Scanner;

public class Basico1983 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int qtde = digitarNumero(s, 3, 100);
		int[] m = new int[qtde];
		double[] n = new double[qtde];
		double nMaior = 0;
		double mMaior = 0;
		
		for (int i = 0; i < n.length; i++) {
			n[i] = -1;
		}
		
		for (int i = 0; i < qtde; i++) {
			m[i] = digitarNumero(s, 1, 1000000);
			n[i] = digitarNumDouble(s, 0.0, 10.0);
			
			for (int j = 0; j < n.length; j++) {
				if (n[i] == n[j]) {
					System.out.println("digite nota novamente");
					n[i] = digitarNumDouble(s, 0.0, 10.0);		
				}
			}
			
			if (n[i] > nMaior) {
				nMaior = n[i];
				mMaior = m[i];
			}	
		}
		
		if (nMaior < 8) {
			System.out.println("Minimum note not reached");
		} else {
			System.out.println(mMaior);
		}
		
	}
	
	private static int digitarNumero(Scanner s, int min, int max) {
		int x = s.nextInt();
		while ((x < min) || (x > max)) {
			x = s.nextInt();	
		}
		return x;
	}
	
	private static double digitarNumDouble(Scanner s, Double min, Double max) {
		double x = s.nextDouble();
		while ((x < min) || (x > max)) {
			x = s.nextDouble();	
		}
		return x;
	}
}
