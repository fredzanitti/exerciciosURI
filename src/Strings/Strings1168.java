package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Strings1168 {
	
	private static final InputStreamReader is = new InputStreamReader(System.in);
	private static final BufferedReader br = new BufferedReader(is);
	private static final StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {		
		int qtde = digitaNumero(0, 1000);
		long numLed;
		for (int i = 0; i < qtde; i++) {
			numLed = digitaNumero(0, Math.pow(10, 100));
			System.out.println(contaLed(numLed) + " leds");
		}
	}
	
	public static int digitaNumero(long min, double d) throws NumberFormatException, IOException {
		int x = Integer.parseInt(br.readLine());
		if ((x < min) || (x > d)) {
			x = Integer.parseInt(br.readLine());
		}
		return x;
	}
	
	public static int contaLed(long numLed){
		sb.delete(0, sb.length());
		sb.append(numLed);
		int soma = 0;
		for (int i = 0; i < sb.length(); i++) {
			soma = soma + ledPorNumero(Character.getNumericValue(sb.charAt(i)));
		}
		return soma;		
	}
	
	public static int ledPorNumero(int num){	
		switch (num) {
		case 0:
			return 6;
		case 1:
			return 2;
		case 2:
			return 5;
		case 3:
			return 5;
		case 4:
			return 4;
		case 5:
			return 5;
		case 6:
			return 6;
		case 7:
			return 3;
		case 8:
			return 7;
		case 9:
			return 6;

		default:
			return 0;
		}
	}
	
}
