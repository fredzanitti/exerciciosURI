package Basico;
import java.util.Scanner;

public class Basico1960 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		StringBuffer st = new StringBuffer();
		
		int num = digitarNumero(s, 0, 1000);
		int nCent = num - (num % 100);
		int nDez = (num - (num % 10)) - nCent;
		int nUni = num - nCent - nDez;

		
	//	I é 1, V é 5, X é 10, L é 50, C é 100, D é 500 e M é 1000.
		
		montaCentena(st, nCent);
		montaDezena(st, nDez);
		montaUnidade(st, nUni);
		
		System.out.println(st.toString());
		
	}

	private static void montaCentena(StringBuffer st, int nCent) {
		if (nCent < 400) {
			for (int i = 0; i < (nCent / 100); i++) {
				st.append("C");
			}
		} else if (nCent == 400) {
			st.append("CD");
		} else if (nCent == 500) {
			st.append("D");
		} else if ((nCent > 500) && (nCent < 900)) {
			st.append("D");
			for (int i = 0; i < ((nCent - 500) / 100); i++) {
				st.append("C");
			}
		} else if (nCent == 900) {
			st.append("CM");
		}
	}
	
	private static void montaDezena(StringBuffer st, int nDez) {
		if (nDez < 40) {
			for (int i = 0; i < (nDez / 10); i++) {
				st.append("X");
			}
		} else if (nDez == 40) {
			st.append("XL");
		} else if (nDez == 50) {
			st.append("L");
		} else if ((nDez > 50) && (nDez < 90)) {
			st.append("L");
			for (int i = 0; i < ((nDez - 50) / 10); i++) {
				st.append("X");
			}
		} else if (nDez == 90) {
			st.append("XC");
		}
	}
	
	private static void montaUnidade(StringBuffer st, int nUni) {
		if (nUni < 4) {
			for (int i = 0; i < nUni; i++) {
				st.append("I");
			}
		} else if (nUni == 4) {
			st.append("IV");
		} else if (nUni == 5) {
			st.append("V");
		} else if ((nUni > 5) && (nUni < 9)) {
			st.append("V");
			for (int i = 0; i < (nUni - 5); i++) {
				st.append("I");
			}
		} else if (nUni == 9) {
			st.append("IX");
		}
	}
	
	private static int digitarNumero(Scanner s, int min, int max) {
		int x = s.nextInt();
		while ((x <= min) || (x >= max)) {
			x = s.nextInt();	
		}
		return x;
	}

}
