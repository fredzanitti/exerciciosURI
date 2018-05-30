package Basico;
import java.util.Scanner;

public class Basico2176 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		StringBuffer st = new StringBuffer();
		st.append(s.next());
		char c;
		int cont = 0;
		
		for (int i = 0; i < st.length(); i++) {
			c = st.charAt(i);		
			if (c == '1') {			
				cont++;
			}
		}	
		
		if ((cont % 2) == 0) {
			st.append("0");
		} else {
			st.append("1");
		}
		
		System.out.println(st.toString());
		s.close();
	}

}
