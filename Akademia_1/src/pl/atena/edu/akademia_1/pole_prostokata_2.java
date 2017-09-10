package pl.atena.edu.akademia_1;

import java.util.Scanner;

public class pole_prostokata_2 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Podaj wartosc boku a:");
		String sa = scanner.nextLine();
		
		System.out.println("Podaj wartosc boku b:");
		String sb = scanner.nextLine();
		
		int a = Integer.valueOf(sa);
		int b = Integer.valueOf(sb);
		
		int result = a * b;
		System.out.println(result);
	}

}
