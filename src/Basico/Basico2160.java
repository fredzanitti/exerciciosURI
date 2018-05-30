package Basico;
import java.util.Scanner;

public class Basico2160 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String st = new String();
		
		st = s.nextLine();
		
		while ((st.length() < 0) || (st.length() > 500)) {
			st = s.nextLine();	
		}
		
		if (st.length() > 80) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
		s.close();
	}

}
