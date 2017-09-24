package pl.atena.edu.akademia_1;

import java.math.BigDecimal;

public class bigDecimal {
	public static void main(String[] args) {

		BigDecimal k = BigDecimal.ONE;
		BigDecimal d = BigDecimal.valueOf(6666);
		//BigDecimal r = k.add(d);
		//BigDecimal r = k.multiply(d);
		BigDecimal r = d.divide(k);
		System.out.println(k);
		System.out.println(d);
		System.out.println(r);
	}
}
// }