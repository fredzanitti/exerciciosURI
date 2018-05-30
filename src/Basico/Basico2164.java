package Basico;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Basico2164 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("0.0");
		int n = digitarNumero(s, 0, 50);
		
		double fib = (Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / 
				      Math.sqrt(5);
		
		System.out.println(f.format(fib).replace(",", "."));
		
	}
	
	private static int digitarNumero(Scanner s, int min, int max) {
		int x = s.nextInt();
		while ((x < min) || (x > max)) {
			x = s.nextInt();	
		}
		return x;
	}

}
