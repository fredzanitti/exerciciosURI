package Basico;

public class Basico2748 {
	public static void main(String[] args){
		StringBuilder l1 = new StringBuilder();
		StringBuilder l2 = new StringBuilder();
		StringBuilder l3 = new StringBuilder();
		StringBuilder l4 = new StringBuilder();
		StringBuilder l5 = new StringBuilder();
		int qtde = 47;
		
		for (int i = 0; i < qtde; i++) {
			l1.append("-");
			if ((i == 0) || (i == qtde -1)) {
				l2.append("|");
				l4.append("|");
				l5.append("|");
			} else {
				//linha 2
				if ((i == 9)) {
					l2.append("ROBERTO");
				} else {
					if ((i < 9) || (i > 15)) {
						l2.append(" ");
					}
				}
				
				//linha 4
				if ((i == 9)) {
					l4.append("5786");
				} else {
					if ((i < 9) || (i > 12)) {
						l4.append(" ");
					}
				}
				
				//linha 5
				if ((i == 9)) {
					l5.append("UNIFEI");
				} else {
					if ((i < 9) || (i > 14)) {
						l5.append(" ");
					}
				}
			}
			
			if ((i == 0) || (i == qtde -1)) {
				l3.append("|");
			} else {
				l3.append(" ");
			}
		}
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);
		System.out.println(l3);
		System.out.println(l5);
		System.out.println(l1);
	}
}
