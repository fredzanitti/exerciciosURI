package Estruturas_e_bibliotecas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EeB_1259 {
	public static void main(String[] args)throws Exception {
		int qtde = digitaNumero(1, (int) Math.pow(10, 5));
		int[] vet = new int[qtde];
		List<Integer> ltPar = new ArrayList<Integer>();
		List<Integer> ltImp = new ArrayList<Integer>();
		
		for (int i = 0; i < qtde; i++) {
			vet[i] = digitaNumero(0, 999999999);
			if ((vet[i] % 2) == 0) {
				ltPar.add(vet[i]);
			} else {
				ltImp.add(vet[i]);
			}
		}
		Collections.sort(ltPar);
		Collections.sort(ltImp);
		for (int i = 0; i < ltPar.size(); i++) {
			System.out.println(ltPar.get(i));
		}
		
		for (int i = ltImp.size(); i > 0; i--) {
			System.out.println(ltImp.get(i-1));
		}
	}
	
	public static int digitaNumero(int min, int max) throws Exception {
		InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
		int vlr = -100;
		vlr = Integer.parseInt(in.readLine());
				
		if ((vlr < min) || (vlr > max)) {
			vlr = Integer.parseInt(in.readLine());
		}
		
		return vlr;
	}
}
