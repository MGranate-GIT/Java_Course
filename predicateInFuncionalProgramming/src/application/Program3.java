// Predicate
/*
(1) Predicate with interface implementation
(2) Predicate with reference method with static method
(3) Predicate with reference method with non static method
(4) Predicate lambda expression reference
(5) Predicate lambda expression "directly in the argument"
*/

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program3 {
	
	public static void main(String[] args) {
	
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double min = 100.0;
		
		// New solution (5)
		/*Predicate<Product> pred = p -> p.getPrice() >= min;*/
		
		list.removeIf(             
				/* (1) new ProdPredicate()*/
				/* (2) Product::staticProdPredicate*/
				/* (3) Product::nonStaticProdPredicate*/
				/* (4) pred */
				/* (5)*/ p -> p.getPrice() >= min);
		for (Product p : list) {
			System.out.println(p);
		}
}
}