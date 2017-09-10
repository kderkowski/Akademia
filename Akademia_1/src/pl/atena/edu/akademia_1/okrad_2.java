package pl.atena.edu.akademia_1;

import java.util.Scanner;

public class okrad_2 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Podaj wartosc promienia r:");
		String ra = scanner.nextLine();
		
		int r = Integer.valueOf(ra);
		
		double result = Math.PI * Math.pow(r, 2);
		System.out.println(result);
	}

}