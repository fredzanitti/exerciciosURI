package Basico;
import java.util.Scanner;

public class Basico2031 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String j1 = "";
		String j2 = "";
		
		int x = s.nextInt();
		while ((x < 1) || (x > 1000)) {
			x = s.nextInt();	
		}
		
		for (int i = 0; i < x; i++) {
			j1 = s.next();
			j2 = s.next();
			verificaAposta(j1, j2);			
		}
		s.close();
	}

	private static void verificaAposta(String ap1, String ap2) {
		int n1 = apostaEscolhida(ap1);
		int n2 = apostaEscolhida(ap2);
		
		if (n1 > n2) {
			System.out.println("Jogador 1 venceu");
		} else if (n2 > n1) {
			System.out.println("Jogador 2 venceu");
		} else if ((n1 == 2) && (n1 == n2)) {
			System.out.println("Sem ganhador");
		} else if ((n1 == 3) && (n1 == n2)) {
			System.out.println("Aniquilacao mutua");
		} else {
			System.out.println("Ambos venceram");
		}
		
	}

	private static int apostaEscolhida(String ap) {
		int x;
		if (ap.equals("ataque")) {
			x = 3;
		} else if (ap.equals("pedra")) {
			x = 2;
		} else {
			x = 1;
		}
		
		return x;
	}

}
