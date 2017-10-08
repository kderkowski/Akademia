package pl.atena.edu.akademia_2;

public class Osoba {
	// konstruktor

	final static int PELNOLETNI = 18;

	public Osoba() {
		// System.out.println("Jestem");
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

	// @Override
	// public String toString() {
	// return "Osoba [imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek +
	// ", wzrost=" + wzrost + "]";
	// }

	public void dodaj(int lata) {
		this.wiek += lata;
	}

	public boolean pelnoletni() {
		return this.wiek < PELNOLETNI ? false : true;
	}

	// 08-10-2017 gettery settery

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public int getWiek() {
		return wiek;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	public int getWzrost() {
		return wzrost;
	}

	public void setWzrost(int wzrost) {
		this.wzrost = wzrost;
	}

	public static int getPelnoletni() {
		return PELNOLETNI;
	}

	// klasa zagnie¿dzona
	public static class Czapka {
		private String marka;

		public Czapka(String marka) {
			this.marka = marka;
		}

		public String toString() {
			return String.format(/* "Czapka (marka%s)", */ marka);
		}
	}

	private Czapka czapka;

	public void dodajCzapka(String marka) {
		czapka = new Czapka(marka);
	}

	public String toString() {
		// return String.format("osoba[imie%s, czapka%s]", imie, czapka);
		return "Osoba [imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek + ", wzrost=" + wzrost + ", czapka="
				+ czapka + "]";
	}

	// public static void main(String[] argc) {
	// Osoba2 osoba = new Osoba2();
	// osoba.dodajCzapka("nike");
	// System.out.println(osoba);
	// }

	/**
	 * Metoda dodaje imie ze zmiennej
	 * @param argc
	 */
	public static void main(String[] argc) {
		Osoba osoba = new Osoba();
		osoba.dodajCzapka("nike");
		System.out.println(osoba);
		System.out.println(Firma.PREZES.getImie());
		System.out.println(Firma.PREZES.getNazwisko());
	}
}
