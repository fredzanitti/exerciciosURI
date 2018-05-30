package Basico;
public class Basico2747 {
	
	public static void main(String[] args){
		StringBuilder l1 = new StringBuilder();
		StringBuilder l2 = new StringBuilder();
		int qtde = 39;
		
		for (int i = 0; i < qtde; i++) {
			l1.append("-");
			if ((i == 0) || (i == qtde -1)) {
				l2.append("|");
			} else {
				l2.append(" ");
			}
		}
		
		System.out.println(l1);
		for (int i = 0; i < 5; i++) {
			System.out.println(l2);	
		}
		System.out.println(l1);
	}
	
}
