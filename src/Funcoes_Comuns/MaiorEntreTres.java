package Funcoes_Comuns;

public class MaiorEntreTres {
	
	public int maiorDeTres(int a, int b, int c){
		int maior = 0;
		
		if (a > b && a > c) {
			maior = a;
		} else {
			if (b > c) {
				maior = b;
			} else {
				maior = c;
			}
		}
		
		return maior;		
	}

}
