package Basico;
import java.util.Scanner;

public class Basico1984 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		StringBuffer st = new StringBuffer();
		StringBuffer stinv = new StringBuffer();
		st.append(s.next());
		
		while (st.equals("0") || (st.length() > 10)) {
			st.delete(0, st.length());
			st.append(s.next());
		}
		
		
		for (int i = st.length() - 1; i >= 0 ; i--) {
			stinv.append(st.charAt(i));
		}
		
		System.out.println(stinv.toString());
		s.close();
	}
}
