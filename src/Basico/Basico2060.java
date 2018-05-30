package Basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basico2060 {
	private final static InputStreamReader is = new InputStreamReader(System.in);
	private final static BufferedReader ir = new BufferedReader(is);
	
	public static void main(String[] args) throws IOException {

		int n = 0;
		n = digitarNumero(1, 1000);
		
		int l = 0;
		int m2 = 0;
		int m3 = 0;
		int m4 = 0;
		int m5 = 0;
		
		for (int i = 0; i < n; i++) {
			l = digitarNumero(1, 100);
			
			if ((l % 2) == 0) {
				m2++;
			}
			
			if ((l % 3) == 0) {
				m3++;
			}
			
			if ((l % 4) == 0) {
				m4++;
			}
			
			if ((l % 5) == 0) {
				m5++;
			}
		}
		
		System.out.println(m2 + " Multiplo(s) de 2");
		System.out.println(m3 + " Multiplo(s) de 3");
		System.out.println(m4 + " Multiplo(s) de 4");
		System.out.println(m5 + " Multiplo(s) de 5");
		
	}

	private static int digitarNumero(int min, int max) throws NumberFormatException, IOException {
		
		int x = Integer.parseInt(ir.readLine());
		while ((x < min) || (x > max)) {
			x = Integer.parseInt(ir.readLine());	
		}
		return x;
	}
	
}
