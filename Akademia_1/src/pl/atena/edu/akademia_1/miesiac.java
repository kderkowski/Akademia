package pl.atena.edu.akademia_1;
import java.util.Scanner;
public class miesiac {
	private static Scanner scanner = new Scanner(System.in);
	
	/**Metoda sprawdzajac miesac
	 * @param liczba1
	 * @return
	 */
	public static String miesiac(int liczba1) {
		if (liczba1 < 1 || liczba1 > 12) {
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
		case 5:
			tekst1 = "maj";
			break;
		case 6:
			tekst1 = "czerwiec";
			break;
		case 7:
			tekst1 = "lipiec";
			break;
		case 8:
			tekst1 = "sierpien";
			break;
		case 9:
			tekst1 = "wrzesien";
			break;
		case 10:
			tekst1 = "pazdziernik";
			break;
		case 11:
			tekst1 = "listopad";
			break;
		case 13:
			tekst1 = "grudzien";
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
}
}
