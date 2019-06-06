package Basico;
import java.util.Scanner;

public class Basico2139 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int dia = 0;
		int mes = 0;
		
		while (s.hasNext()) {
			mes = digitarNumero(s, 1, 12);
			if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) ||
				(mes == 8) || (mes == 10) || (mes == 12)) {
				dia = digitarNumero(s, 0, 31);
			} else if (mes == 2) {
				dia = digitarNumero(s, 0, 29);
			} else {
				dia = digitarNumero(s, 0, 30);
			}
			
			if ((dia == 24) && (mes == 12)) {
				System.out.println("E vespera de natal!");
			} else if ((dia == 25) && (mes == 12)) {
				System.out.println("E natal!");
			} else if ((dia > 25) && (mes == 12)) {
				System.out.println("O Natal ja era!");
			} else {
				System.out.println("Faltam " + diasFaltantes(dia, mes) + " dias para o natal!");
			}
		}
		
		
	}
	
	private static int diasFaltantes(int d, int m){
		int totalDias = 0;
		int v[] = new int[12];
		v[0] = 31;
		v[1] = 29;
		v[2] = 31;
		v[3] = 30;
		v[4] = 31;
		v[5] = 30;
		v[6] = 31;
		v[7] = 31;
		v[8] = 30;
		v[9] = 31;
		v[10] = 30;
		v[11] = 25;
		
		for (int i = m-1; i < v.length; i++) {
			if (i == m-1) {
				totalDias = totalDias + v[i] - d;
			} else {
				totalDias = totalDias + v[i];
			}
		}
		
		return totalDias;
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
