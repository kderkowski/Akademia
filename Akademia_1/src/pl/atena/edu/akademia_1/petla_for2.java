package pl.atena.edu.akademia_1;

public class petla_for2 {
	public static void main(String[] args) {

		for (int x = 0; x <= 10; x++) {

			for (int y = 0; y <= 10; y++) {

				if (x == 0) {
					System.out.printf("%4d", y);//pierwsza kolumna
				} else if (y == 0) {
					System.out.printf("%4d", x);// pierwszy wiersz
				} else {
					System.out.printf("%4d", x * y);
				}
				// System.out.printf("%4d", y);
				// System.out.print(y);
			}
			System.out.println();
		}
	}
}