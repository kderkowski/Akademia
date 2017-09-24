package pl.atena.edu.akademia_1;

import java.util.Random;

public class petla_while2 {
	public static void main(String[] args) {
		Integer warunek = 0;
		Integer sum = 0;
		int iteracje = 0;
		// Random generator = new Random();
		while (warunek <= 100) {
//			if (sum % 2 == 0) {
//	sum += warunek;
//			}
			sum+= ++warunek %2 ==0 ? warunek :0;

			// iteracje++;
		}
		 System.out.println(sum);
		// System.out.printf("Osiagnieto liczbe %d w %d iteracjach", sum, iteracje);
	}

}
