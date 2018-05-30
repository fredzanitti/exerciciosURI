package Basico;
import java.util.Scanner;

public class Basico2165 {
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		String texto = "";
		int cont = 0;

		texto = digitarEntr(s, 1, 500);
		cont = texto.length() + 1;
		
		if (cont > 140) {
			System.out.println("MUTE");
		} else {
			System.out.println("TWEET");
		}		
		
	}
	
	
	private static String digitarEntr(Scanner s, int min, int max) {
		String t = s.nextLine();
		
		while ((t.length() + 1 < min) || (t.length() + 1 > max)) {
			t = s.nextLine();
		}
		return t;
	}
}



