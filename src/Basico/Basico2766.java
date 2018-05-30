package Basico;
import java.util.Scanner;

public class Basico2766 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		StringBuilder[] nomes = new StringBuilder[10];
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = digitaNome(s);
		}
		
		System.out.println(nomes[2]);
		System.out.println(nomes[6]);
		System.out.println(nomes[8]);
	}
	
	public static StringBuilder digitaNome(Scanner s){
		String nome = s.nextLine();
		StringBuilder nomeSemEspaco = new StringBuilder();
		StringBuilder result = new StringBuilder();
		while (nome.length() > 30) {
			nome = s.nextLine();
		}
		
		nomeSemEspaco.append(nome);
		for (int i = 0; i < nomeSemEspaco.length(); i++) {
			if (nomeSemEspaco.charAt(i) != ' ') {
				result.append(nomeSemEspaco.charAt(i));
			}
		}
		
		return result;
	}
}
