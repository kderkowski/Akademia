package pl.atena.edu.akademia_1;

public class tablica2 {
	public static void main(String[] args) {

		// int auto[] = new int[10];
		/// for (int x = 0; x < 10; x++) {
		// System.out.println(auto[x]);
		// }
		// int auto1[] = new int[10];
		// for (int y = 0; y < auto1.length; y++) {
		// System.out.println(auto1[y]);

		// }
		//
		// int auto2[] = new int[10];
		// for (int item: auto2) {
		// System.out.println(item);

		// }
		// int x=10;
		// int auto3[] = {9,8,7,6,5,4,3,2,1,0};
		// for (int x = 0; x < 10; x++) {
		// System.out.println("dane["+ x +"]="+ auto3[x]);

		// int auto4[] = new int [10], liczba = 9;
		// for (int x = 0; x < auto4.length; x++, liczba--) {
		// System.out.println("dane[" + x + "]=" + auto4[x]);

		// int auto5[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		// int test[] = auto5;
		// int test1[] = Arrays.copyOf(auto5, auto5.length);
		// test[0] = 10;
		// Arrays.sort(auto5); //sortowanie
		// Arrays.fill(auto5,10); //przypisuje t¹ sama wartoœæ, wype³nia

		// Integer [][] auto6 = {{1,2,3,4}, {1,2,3,4}, {1,2,3,4}};
		// for (Integer[] kolumna: auto6) {
		// for (Integer element: kolumna) {
		// System.out.print(element + "");
		// }
		// System.out.print("\n");
		// }

		// System.out.println(Arrays.toString(auto5));
		// System.out.println(Arrays.toString(test));
		// System.out.println(Arrays.toString(test1));

		Integer[][] tab2 = new Integer[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == j || i + j == 9) {
					tab2[i][j] = 5;
				} else {
					tab2[i][j] = 0;
				}
				System.out.printf("%4d", tab2[i][j]);
			}
			System.out.println();
		}
	}
}
// }