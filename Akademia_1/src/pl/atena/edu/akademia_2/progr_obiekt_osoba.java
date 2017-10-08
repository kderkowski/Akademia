package pl.atena.edu.akademia_2;


public class progr_obiekt_osoba {
	public static void main(String[] args) {

//		Osoba osoba = new Osoba();
	//	System.out.println(osoba);
		
		Osoba osoba1 = new Osoba("Krystian");
		Osoba osoba2 = new Osoba(16);
		Osoba osoba3 = new Osoba(33, 180);
		Osoba osoba4 = new Osoba("Krystian", "Derkowski", 33,180);
		Osoba osoba5 = Osoba.instance("maniek");
		osoba3.dodaj(5);
		
		System.out.println(osoba1);
		System.out.println(osoba2 + " czy pe³noletni: " + (osoba2.pelnoletni()? "Tak": "Nie"));
		System.out.println(osoba3 + " czy pe³noletni: " + osoba3.pelnoletni());
		System.out.println(osoba4);
		System.out.println(osoba5);
		System.out.println(Firma.PREZES.getImie());
		System.out.println(Firma.PREZES.getNazwisko());
//		System.out.println(osoba6);
	}
}