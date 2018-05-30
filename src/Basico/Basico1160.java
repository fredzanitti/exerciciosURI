package Basico;
import java.util.Scanner;

public class Basico1160 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		int PA = 0;
		int PB = 0;
		double G1 = 0;
		double G2 = 0;
		int anos = 0;
		
		int T = s.nextInt();
		while ((T < 1) || (T > 3000)) {
			T = s.nextInt();
		}
		
		for (int i = 0; i < T; i++) {
			PA = Integer.parseInt(s.nextLine());
			while ((PA < 100) || (PA > 1000000)) {
				PA = Integer.parseInt(s.nextLine());
			}
			
			PB = Integer.parseInt(s.nextLine());
			while ((PB < PA) || (PB > 1000000)) {
				PB = Integer.parseInt(s.nextLine());
			}
			
			G1 = Double.parseDouble(s.nextLine());
			while ((G1 < 0.1) || (G1 > 10.0)) {
				G1 = Double.parseDouble(s.nextLine());
			}
			
			G2 = Double.parseDouble(s.nextLine());
			while ((G2 < 0) || (G2 > 10.0)) {
				G2 = Double.parseDouble(s.nextLine());
			}
			
			while (PA <= PB) {
				anos++;
				
				PA = (int) (PA + PA * (G1/100));
				PB = (int) (PB + PB * (G2/100));
				
				if (anos > 100) {
					PA = 1;
					PB = 0;
				}

			}
			
			if (anos > 100) {
				System.out.println("Mais de 1 seculo.");
			} else {
				System.out.println(anos + " anos.");
			}
			anos = 0;
		}
		s.close();
	}

}
