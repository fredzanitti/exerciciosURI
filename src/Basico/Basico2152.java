package Basico;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Basico2152 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("00");
		
		int ncase = s.nextInt();
		int h = 0;
		int m = 0;
		int o = 0;
		
		for (int i = 0; i < ncase; i++) {
			h = s.nextInt();
			m = s.nextInt();
			o = s.nextInt();
			
			System.out.print(f.format(h) + ":" + f.format(m) + " - A porta ");
			if (o == 1) {
				System.out.println("abriu!");	
			} else {
				System.out.println("fechou!");
			}
		}
		s.close();
	}
}
