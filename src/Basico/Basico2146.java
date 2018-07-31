package Basico;
import java.util.Scanner;
import Funcoes_Comuns.LerValores;

public class Basico2146 {
	public static void main(String[] args){
		LerValores ler = new LerValores();
		Scanner s = new Scanner(System.in);
		int n = 0;
		
		while (s.hasNext()) {
			n = ler.lerValoresInt(s, 1000, 9999);
			System.out.println(n - 1);
		}
		
		s.close();
	}
}
