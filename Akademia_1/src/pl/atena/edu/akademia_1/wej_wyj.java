package pl.atena.edu.akademia_1;

import java.util.Scanner;

public class wej_wyj {
	public static void main(String[] args) {
		String tekst = "hshdhshd \n dfsdfsdfsdf \n sdfsd";
		Scanner scanner = new Scanner(tekst);
		System.out.println("czy jest nowa linia" + scanner.hasNext());
		System.out.println("Wczytuje:" + scanner.nextLine());
		System.out.println("czy jest nowa linia" + scanner.hasNext());
		System.out.println("Wczytuje:" + scanner.nextLine());
		System.out.println("czy jest nowa linia" + scanner.hasNext());
		System.out.println("Wczytuje:" + scanner.nextLine());
		System.out.println("czy jest nowa linia" + scanner.hasNext());
		System.out.println("Wczytuje:" + scanner.nextLine());
		scanner.close();
	}

}