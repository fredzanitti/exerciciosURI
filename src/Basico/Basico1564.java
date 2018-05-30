package Basico;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basico1564 {
	public static void main(String[] args){
		BufferedReader inReader;
		inReader = new BufferedReader(new InputStreamReader(System.in));

		String valor1;

		try {
			valor1 = inReader.readLine();	
			
			while ((valor1 != null) && (!valor1.equals(""))) {				
				if (valor1.equals("0")) {
					System.out.println("vai ter copa!");
				} else {
					System.out.println("vai ter duas!");
				}
			
				valor1 = inReader.readLine();	
			}
		} catch (IOException ex) {

		}
	}

}
