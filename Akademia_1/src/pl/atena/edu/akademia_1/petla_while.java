package pl.atena.edu.akademia_1;

import java.util.Random;

public class petla_while {
	public static void main(String[] args) {
		Integer warunek = 100;
		Integer sum = 0;
		int iteracje = 0;
		Random generator = new Random();
		while (sum.compareTo(warunek) < 0) {
			sum += generator.nextInt(10);
			System.out.println(sum);
			iteracje++;
		}
		System.out.printf("Osiagnieto liczbe %d w %d iteracjach", sum, iteracje);
	}

}
