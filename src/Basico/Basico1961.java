package Basico;
import java.util.Scanner;

public class Basico1961 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int alturaPulo = digitarNumero(s, 1, 5);
		int qtdeCanos = digitarNumero(s, 2, 100);
		int n = 0;
		int ant = 0;
		boolean conseguiu = true;
				
		for (int i = 0; i < qtdeCanos; i++) {
			
			n = digitarNumero(s, 0, 10);
			if ((Math.abs((n - ant)) > alturaPulo) && (ant != 0)) {
				conseguiu = false;
			}
			ant = n;
		}
		
		if (conseguiu) {
			System.out.println("YOU WIN");
		} else {
			System.out.println("GAME OVER");
		}
		
		
	}
	
	private static int digitarNumero(Scanner s, int min, int max) {
		int x = s.nextInt();
		while ((x < min) || (x > max)) {
			x = s.nextInt();	
		}
		return x;
	}

}
