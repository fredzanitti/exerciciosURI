package Basico;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basico1534 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int[][] m = new int[1][1];		
        String linha;
        try {
        	linha = b.readLine();
    		if ((Integer.parseInt(linha) < 3) || (Integer.parseInt(linha) > 70)) {
    			linha = b.readLine();
    		}
        	        	
        	while ((linha != null) && (!linha.equals(""))) {
				m = new int[Integer.parseInt(linha)][Integer.parseInt(linha)];
				for (int i = 0; i < Integer.parseInt(linha); i++) {
					for (int j = 0; j < Integer.parseInt(linha); j++) {
						m[i][j] = b.read();
					}
				}
				
				for (int i = 0; i < Integer.parseInt(linha); i++) {
					for (int j = 0; j < Integer.parseInt(linha); j++) {
						System.out.println(m[i][j]);
					}
				}
				
	        	linha = b.readLine();
	    		if ((Integer.parseInt(linha) < 3) || (Integer.parseInt(linha) > 70)) {
	    			linha = b.readLine();
	    		}
			}
        	
		} catch (Exception e) {

		}   
	}

}
