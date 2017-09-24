package pl.atena.edu.akademia_1;

import java.util.Random;

public class petla_do_while2 {
	public static void main(String[] args) {
		int iteracje = 0;
		int liczba = 5, los = 0;
		Random generator = new Random();
		do {
			los = generator.nextInt(10);
			iteracje++;
		} while (los != liczba);
		{
			System.out.printf("osiagnieto liczbe %d w probach %d", liczba, los);
		}

	}

}
