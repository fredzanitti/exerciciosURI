package Basico;
import java.util.Scanner;
import Funcoes_Comuns.LerValores;

public class Basico1933 {
	
	private static Scanner s = new Scanner(System.in); 
	
	public static void main(String[] args){

		int a = LerValores.lerValoresInt(s, 1, 13);
		int b = LerValores.lerValoresInt(s, 1, 13);
		
		if ((a > b) || (a == b)) {
			System.out.println(a);
		} else if (a < b) {
			System.out.println(b);
		}
		s.close();
	}
	
}
