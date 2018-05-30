package Basico;

public class preencherMatriz {
	public void matrizDouble(double m[][], int t){
		
		double num = 0;
		
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < t; j++) {
				m[i][j] = num + 1;
				num++;
			}
		}
	}

	public void matrizInt(int m[][], int t){
		
		int num = 0;
		
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < t; j++) {
				m[i][j] = num + 1;
				num++;
			}
		}
	}
	
}
