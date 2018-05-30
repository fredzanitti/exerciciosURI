package Basico;

import java.util.Scanner;

public class Basico2702 {

	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		String refDisp = s.nextLine();
		String vlrRefDisp[] = refDisp.split(" ");
		String refRequ = s.nextLine();
		String vlrRefRequ[] = refRequ.split(" ");

		int faltaRefFran = Integer.parseInt(vlrRefRequ[0]) - Integer.parseInt(vlrRefDisp[0]);
		int faltaRefBife = Integer.parseInt(vlrRefRequ[1]) - Integer.parseInt(vlrRefDisp[1]);
		int faltaRefMass = Integer.parseInt(vlrRefRequ[2]) - Integer.parseInt(vlrRefDisp[2]);

		if (faltaRefFran < 0) {
			faltaRefFran = 0;
		}
		if (faltaRefBife < 0) {
			faltaRefBife = 0;
		}
		if (faltaRefMass < 0) {
			faltaRefMass = 0;
		}

		System.out.println(faltaRefFran + faltaRefBife + faltaRefMass);
	}

}
