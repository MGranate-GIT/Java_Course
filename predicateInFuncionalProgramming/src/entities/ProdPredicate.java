// New solution (2)

package entities;

import java.util.function.Predicate;

public class ProdPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		
		return p.getPrice() >= 100.0;
	}

}
