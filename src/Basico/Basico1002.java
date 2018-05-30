package Basico;
import java.util.Scanner;

public class Basico1002 {
    public static void main(String[] args) {
    	 
		double pi = 3.14159;		
		Scanner sc1 = new Scanner(System.in);
		double r = sc1.nextDouble();
		double area = pi * (Math.pow(r, 2));
		
		System.out.printf("A=%.4f \n", area);
		sc1.close();
 
    }
}
