package Basico;
import java.util.Scanner;

import Funcoes_Comuns.LerValores;

public class Basico2146 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = 0;
		
		while (s.hasNext()) {
			n = LerValores.lerValoresInt(s, 1000, 9999);
			System.out.println(n - 1);
		}
		
		s.close();
	}
}
