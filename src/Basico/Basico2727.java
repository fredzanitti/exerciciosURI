package Basico;
import java.util.Scanner;

public class Basico2727 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int qtde = s.nextInt();
		String tx = "";

		for (int i = 0; i <= qtde; i++) {
			tx = s.nextLine();
			identificaCaractere(tx);
		}
		s.close();
	}

	private static void identificaCaractere(String t) {

		switch (t) {
		case ".":
			System.out.println("a");
			break;
		case "..":
			System.out.println("b");
			break;
		case "...":
			System.out.println("c");
			break;
		case ". .":
			System.out.println("d");
			break;
		case ".. ..":
			System.out.println("e");
			break;
		case "... ...":
			System.out.println("f");
			break;	
		case ". . .":
			System.out.println("g");
			break;
		case ".. .. ..":
			System.out.println("h");
			break;
		case "... ... ...":
			System.out.println("i");
			break;
		case ". . . .":
			System.out.println("j");
			break;
		case ".. .. .. ..":
			System.out.println("k");
			break;
		case "... ... ... ...":
			System.out.println("l");
			break;	
		case ". . . . .":
			System.out.println("m");
			break;
		case ".. .. .. .. ..":
			System.out.println("n");
			break;
		case "... ... ... ... ...":
			System.out.println("o");
			break;	
		case ". . . . . .":
			System.out.println("p");
			break;
		case ".. .. .. .. .. ..":
			System.out.println("q");
			break;
		case "... ... ... ... ... ...":
			System.out.println("r");
			break;	
		case ". . . . . . .":
			System.out.println("s");
			break;
		case ".. .. .. .. .. .. ..":
			System.out.println("t");
			break;
		case "... ... ... ... ... ... ...":
			System.out.println("u");
			break;	
		case ". . . . . . . .":
			System.out.println("v");
			break;
		case ".. .. .. .. .. .. .. ..":
			System.out.println("w");
			break;
		case "... ... ... ... ... ... ... ...":
			System.out.println("x");
			break;		
			
		case ". . . . . . . . .":
			System.out.println("y");
			break;
		case ".. .. .. .. .. .. .. .. ..":
			System.out.println("z");
			break;			

		default:
			break;
		}
	}

}
