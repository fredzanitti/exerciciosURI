package Basico;
import java.util.Scanner;

public class Basico1957 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		StringBuilder result = new StringBuilder();
		int[] hexa = new int[100];
		for (int i = 0; i < hexa.length; i++) {
			hexa[i] = -1;
		}
		
		int n = s.nextInt();
		while ((n < 1) || (n > (2 * Math.pow(10, 9)))) {
			n = s.nextInt();
		}
		int quoc = n;
		int rest = 0;
		int i = 0;
		
		while (quoc >= 16) {
			rest = quoc % 16;
			quoc = quoc / 16;
			hexa[i] = rest;
			i++;
		}
		
		hexa[i] = quoc;

		for (int j = (hexa.length - 1); j >= 0; j--) {
			if (hexa[j] != -1) {
				result.append(valorHexadecimal(hexa[j]));
			}
		}
		
		System.out.println(result.toString());
		s.close();
	}

	private static String valorHexadecimal(int pos) {
		String[] rel = new String[16];
		rel[0] = "0";
		rel[1] = "1";
		rel[2] = "2";
		rel[3] = "3";
		rel[4] = "4";
		rel[5] = "5";
		rel[6] = "6";
		rel[7] = "7";
		rel[8] = "8";
		rel[9] = "9";
		rel[10] = "A";
		rel[11] = "B";
		rel[12] = "C";
		rel[13] = "D";
		rel[14] = "E";
		rel[15] = "F";
		
		return rel[pos];
	}

}
