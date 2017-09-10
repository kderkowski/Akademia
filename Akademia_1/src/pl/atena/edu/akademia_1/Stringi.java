package pl.atena.edu.akademia_1;

public class Stringi {
	public static void main(String[] args) {
		String java = "Java\u2122";
		System.out.println(java);
		// konwersja
		int age = 42;
		String output = age + "lata";
		System.out.println(output);
		// ³¹czy stringi
		String kursanci = String.join(",", "Aleksander", "Krystian", "Wiesia");
		System.out.println(kursanci);
		//
		System.out.println(kursanci.length());
		// odcina
		System.out.println(kursanci.substring(4, 6));
		// odcina
		System.out.println(kursanci.substring(10));
		// ³¹czenie
		String[] tKursanci = kursanci.split(",");
		System.out.println(kursanci);
		
		//NIE POROWNYWAÆ STRINGOW
		
		String krystian1 = "Krystian";
		String krystian2 = "Krystian B³awat".substring(0, 8);
		boolean test1 = krystian1 == krystian2;
		System.out.println(test1);
		boolean test2 = krystian1.equals(krystian2);
		System.out.println(test2);

	}

}
