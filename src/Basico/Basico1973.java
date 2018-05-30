package Basico;
import java.util.Scanner;

public class Basico1973 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int estrelas = digitarNumero(s, 0, Math.pow(10, 6));
		int[] ovelhas = new int[estrelas];
		int soma = 0;
		int cont = 0;
		
		for (int i = 0; i < estrelas; i++) {
			ovelhas[i] = digitarNumero(s, 0, Math.pow(10, 6));
		}
		int j = 0;
		
		while ((j >= 0) && (j < estrelas)) {
			soma = soma + ovelhas[j] - 1;
			cont++;
			
			if ((ovelhas[j] % 2) == 0) {
				ovelhas[j] = ovelhas[j] - 1;
				j--;
			} else {
				ovelhas[j] = ovelhas[j] - 1;
				j++;
			}
		}
		System.out.println(cont + " " + soma);		
	}
	
	private static int digitarNumero(Scanner s, int min, double d) {
		int x = s.nextInt();
		while ((x <= min) || (x >= d)) {
			x = s.nextInt();	
		}
		return x;
	}

}
