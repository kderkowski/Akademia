package pl.atena.edu.akademia_1;

import java.util.Arrays;

public class tablica {
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

		int auto5[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		int test[] = auto5;
		int test1[] = Arrays.copyOf(auto5, auto5.length);
		test[0] = 10;
		
		System.out.println(Arrays.toString(auto5));
		System.out.println(Arrays.toString(test));
		System.out.println(Arrays.toString(test1));
	}
}
// }