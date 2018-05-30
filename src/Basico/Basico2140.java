package Basico;
import java.util.Scanner;

public class Basico2140 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = digitarNumero(s, 1, (int) Math.pow(10, 4));
		int m = digitarNumero(s, n, (int) Math.pow(10, 4));
		int troco = 0;
		
		while ((n != 0) && (m != 0)) {			
			troco = m - n;

			if ((verificaPossibilidade(troco, 2)) ||
				(verificaPossibilidade(troco, 5)) ||
				(verificaPossibilidade(troco, 10)) ||
				(verificaPossibilidade(troco, 20)) ||
				(verificaPossibilidade(troco, 50)) ||
				(verificaPossibilidade(troco, 100))
			) {
				System.out.println("possible");				
			} else {
				System.out.println("impossible");
			}						
			n = digitarNumero(s, 1, (int) Math.pow(10, 4));
			m = digitarNumero(s, n, (int) Math.pow(10, 4));
		}		
	}
	
	private static boolean verificaPossibilidade(int troco, int vlr){
		boolean result = false;
		
		if ((troco == vlr + 2) && (vlr != 2)) {
			result = true;
		} else if ((troco == vlr + 5) && (vlr != 5)) {
			result = true;
		} else if ((troco == vlr + 10) && (vlr != 10)) {
			result = true;
		} else if ((troco == vlr + 20) && (vlr != 20)) {
			result = true;
		} else if ((troco == vlr + 50) && (vlr != 50)) {
			result = true;
		} else if ((troco == vlr + 100) && (vlr != 100)) {
			result = true;
		}
		
		return result;
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
}
