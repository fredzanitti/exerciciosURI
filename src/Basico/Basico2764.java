package Basico;

import java.io.IOException;
import java.util.Scanner;

public class Basico2764 {

	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(System.in);
		StringBuilder data = new StringBuilder();

		data.append(s.nextLine());
		String dia = (String) data.subSequence(0, 2);
		String mes = (String) data.subSequence(3, 5);
		String ano = (String) data.subSequence(6, 8);

		System.out.println(mes + "/" + dia + "/" + ano);
		System.out.println(ano + "/" + mes + "/" + dia);
		System.out.println(dia + "-" + mes + "-" + ano);
		s.close();
	}

}
