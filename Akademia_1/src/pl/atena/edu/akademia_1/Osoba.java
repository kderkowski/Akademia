package pl.atena.edu.akademia_1;

public class Osoba {
	// konstruktor
	
	final static int PELNOLETNI = 18;
	public Osoba() {
		System.out.println("Jestem");
	}

	// public Osoba(String komunikat) {
	// System.out.println(komunikat);
	// }

	private String imie;
	private String nazwisko;
	private int wiek;
	private int wzrost;

	public Osoba(int wiek) {
		this.wiek = wiek;
	}

	public Osoba(int wiek, int wzrost) {
		// this.wiek = wiek;
		this(wiek);
		this.wzrost = wzrost;
	}

	public Osoba(String imie, String nazwisko, int wiek, int wzrost) {
		this(wiek, wzrost);
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	public Osoba(String imie) {
		this.imie = imie;
	}

	public static Osoba instance(String imie) {
		return new Osoba(imie);
	}

	@Override
	public String toString() {
		return "Osoba [imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek + ", wzrost=" + wzrost + "]";
	}

	public void dodaj(int lata) {
		this.wiek += lata;
	}

	public boolean pelnoletni() {
		return this.wiek < PELNOLETNI ? false : true;
	}
}
