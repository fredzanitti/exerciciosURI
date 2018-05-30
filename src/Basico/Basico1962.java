package Basico;
import java.util.Scanner;

public class Basico1962 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		/*
		long qtde = digitarNumero(s, 1, 10000);
		long t = 0;
		long total = 0;
		
		for (int i = 0; i < qtde; i++) {
			t = digitarNumero(s, 0, Math.pow(2, 31));
			total = Math.abs(2015 - t);
			if (t >= 2015) {
				System.out.println((total + 1) + " A.C.");
			} else {
				System.out.println(total + " D.C.");
			}
		}*/
		int n = s.nextInt();
	    for(int i=0;i<n;i++){
	        int t1 = s.nextInt();
	        int resultado = 2015 - t1;
	        if(resultado<0 || resultado == 0){
	            System.out.println(Math.abs(resultado-1)+ " A.C.");
	        }
	        else{
	            System.out.println(resultado + " D.C.");
	        }
	    }
		s.close();
	}

}
