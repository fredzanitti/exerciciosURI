package Basico;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Basico2759 {
	public static void main(String[] args){
		String a = digitaCaractere();
		String b = digitaCaractere();
		String c = digitaCaractere();
		
		System.out.println("A = " + a + ", B = " + b + ", C = " + c);
		System.out.println("A = " + b + ", B = " + c + ", C = " + a);
		System.out.println("A = " + c + ", B = " + a + ", C = " + b);		
		
	}
	
	public static String digitaCaractere(){
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader ir = new BufferedReader(is);
		
		String caracter = "";
		try {
			caracter = ir.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while (caracter.length() > 1) {
			try {
				caracter = ir.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		

		return caracter;
	}
}