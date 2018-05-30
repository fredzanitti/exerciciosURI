package Basico;
import java.util.Scanner;

public class Basico2338 {
	public static void main(String[] args) {
		StringBuffer st = new StringBuffer();
		StringBuffer frase = new StringBuffer();

		Scanner s = new Scanner(System.in);
		String[] morse = new String[43];
		String[] letra = new String[43];
		InicializarVetores(morse, letra);
		String cod = "";
		while (s.hasNext()) {
			cod = s.next();
			cod = cod.replace(".....", "|");
			cod = cod.replace("...", "/");
			cod = cod + "/";

			for (int i = 0; i < cod.length(); i++) {
				if (cod.charAt(i) == '|') {
					frase.append(buscaCaractere(morse, letra, st.toString()));
					frase.append(" ");
					st.delete(0, st.length());
				} else {
					if (cod.charAt(i) != '/') {
						st.append(cod.charAt(i));
					} else {
						frase.append(buscaCaractere(morse, letra, st.toString()));
						st.delete(0, st.length());
					}
				}
			}
			System.out.println(frase.toString());
			frase.delete(0, frase.length());
		}
		s.close();

	}

	private static String buscaCaractere(String[] morse, String[] letra, String codigo) {
		String carac = "";
		for (int i = 0; i < 43; i++) {
			if (codigo.equals(morse[i])) {
				carac = letra[i];
			}
		}
		return carac;
	}

	private static void InicializarVetores(String[] morse, String[] letra) {
		morse[0] = "=.===";
		morse[1] = "===.=.=.=";
		morse[2] = "===.=.===.=";
		morse[3] = "===.=.=";
		morse[4] = "=";
		morse[5] = "=.=.===.=";
		morse[6] = "===.===.=";
		morse[7] = "=.=.=.=";
		morse[8] = "=.=";
		morse[9] = "=.===.===.===";
		morse[10] = "===.=.===";
		morse[11] = "=.===.=.=";
		morse[12] = "===.===";
		morse[13] = "===.=";
		morse[14] = "===.===.===";
		morse[15] = "=.===.===.=";
		morse[16] = "===.===.=.===";
		morse[17] = "=.===.=";
		morse[18] = "=.=.=";
		morse[19] = "===";
		morse[20] = "=.=.===";
		morse[21] = "=.=.=.===";
		morse[22] = "=.===.===";
		morse[23] = "===.=.=.===";
		morse[24] = "===.=.===.===";
		morse[25] = "===.===.=.=";
		morse[26] = "===.===.===.===.===";
		morse[27] = "=.===.===.===.===";
		morse[28] = "=.=.===.===.===";
		morse[29] = "=.=.=.===.===";
		morse[30] = "=.=.=.=.===";
		morse[31] = "=.=.=.=.=";
		morse[32] = "===.=.=.=.=";
		morse[33] = "===.===.=.=.=";
		morse[34] = "===.===.===.=.=";
		morse[35] = "===.===.===.===.=";
		morse[36] = "=.===.=.===";
		morse[37] = "=.===.===.=.===";
		morse[38] = "===.===.===.===";
		morse[39] = "=.=.===.=.=";
		morse[40] = "===.===.=.===.===";
		morse[41] = "===.===.===.=";
		morse[42] = "=.=.===.===";

		letra[0] = "a";
		letra[1] = "b";
		letra[2] = "c";
		letra[3] = "d";
		letra[4] = "e";
		letra[5] = "f";
		letra[6] = "g";
		letra[7] = "h";
		letra[8] = "i";
		letra[9] = "j";
		letra[10] = "k";
		letra[11] = "l";
		letra[12] = "m";
		letra[13] = "n";
		letra[14] = "o";
		letra[15] = "p";
		letra[16] = "q";
		letra[17] = "r";
		letra[18] = "s";
		letra[19] = "t";
		letra[20] = "u";
		letra[21] = "v";
		letra[22] = "w";
		letra[23] = "x";
		letra[24] = "y";
		letra[25] = "z";
		letra[26] = "0";
		letra[27] = "1";
		letra[28] = "2";
		letra[29] = "3";
		letra[30] = "4";
		letra[31] = "5";
		letra[32] = "6";
		letra[33] = "7";
		letra[34] = "8";
		letra[35] = "9";
		letra[36] = "ä";
		letra[37] = "á";
		letra[38] = "ch";
		letra[39] = "é";
		letra[40] = "ñ";
		letra[41] = "ö";
		letra[42] = "ü";
	}

}
