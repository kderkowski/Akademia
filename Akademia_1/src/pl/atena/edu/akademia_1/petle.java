package pl.atena.edu.akademia_1;

import java.util.Scanner;

public class petle {
	private static Scanner scanner = new Scanner(System.in);

	public static final int MIN = 1;
	public static final int MAX = 2;

	/**
	 * Metoda sprawdza czy podana liczba jest w zakresie MIN, MAX
	 * 
	 * @param liczba
	 * @param komunikat
	 * @return
	 */
	public static boolean sprawdz(int liczba, String komunikat) {
		if (!(liczba >= MIN && liczba <= MAX)) {
			System.out.println("Liczba" + komunikat + " jest spoza zakresu od 1 do 2");
			return false;
		}
		return true;
	}

	/**Metoda sprawdzajac miesac
	 * @param liczba1
	 * @return
	 */
	public static String miesiac(int liczba1) {
		if (liczba1 < 1 || liczba1 > 4) {
			return "Nie jest miesiacem";
		}
		String tekst1 = null;
		switch (liczba1) {
		case 1:
			tekst1 = "styczeñ";
			break;
		case 2:
			tekst1 = "luty";
			break;
		case 3:
			tekst1 = "marzec";
			break;
		case 4:
			tekst1 = "kwiecen";
			break;
		default:
			break;
		}
		return tekst1;
	}

	public static void main(String[] args) {

		System.out.println("Podaj miesiac");
		String miesiac = scanner.nextLine();
		int c = Integer.valueOf(miesiac);

		String msc = miesiac(c);
		System.out.println(msc);

		System.out.println("Podaj wartosc boku a:");
		String sa = scanner.nextLine();

		System.out.println("Podaj wartosc boku b:");
		String sb = scanner.nextLine();

		int a = Integer.valueOf(sa);
		int b = Integer.valueOf(sb);

		boolean testA = sprawdz(a, "A");
		boolean testB = sprawdz(b, "B");

		if (!testA && !testB) {
			System.out.println("We¿ siê oranij!!!");
		} else if (testA && !testB) {
			System.out.println("Popraw b");
		} else if (!testA && testB) {
			System.out.println("Popraw a");
		} else {
			int result = a * b;
			System.out.println(result);
		}

		//String tekst = null;
		//switch (a) {
	//	case 1:
		//	tekst = "styczeñ";
		//	break;
		//case 2:
		//	tekst = "luty";
		//	break;
	//	default:
	//		break;
	//	}
	//	System.out.println(tekst);

		// if (testA && testB) {
		// petle_part1
		// if (a >= 0 && a <= 10) {
		// } else {
		// System.out.println("Licza a jest spoza zakresu od 1 do 10");
		// return;
		// }

		// if (!(a >= 5 && a <= 10)) {
		// System.out.println("Liczba a jest spoza zakresu od 5 do 10");
		// return;
		// }
		// if (!(b >= 1 && b <= 5)) {
		// System.out.println("Liczba b jest spoza zakresu od 1 do 5");
		// return;
		// }

		// int result = a * b;
		// System.out.println(result);
	}
}
