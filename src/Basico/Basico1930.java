package Basico;
import java.util.Scanner;

public class Basico1930 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int t = 0;
		int soma = 0;
		
		for (int i = 0; i < 4; i++) {
			t = digitarNumero(s, 2, 6);
			soma = soma + t;
		}
		
		System.out.println(soma - 3);
		
	}
	
	private static int digitarNumero(Scanner s, int min, int max) {
		int x = s.nextInt();
		while ((x < min) || (x > max)) {
			x = s.nextInt();	
		}
		return x;
	}

}
