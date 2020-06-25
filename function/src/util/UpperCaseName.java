package util;


import java.util.function.Function;

import entities.Product;

public class UpperCaseName implements Function<Product, String> {

	// (1)

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
