/*
(1) Consumer with interface implementation
(2) Consumer with reference method with static method
(3) Consumer with reference method with non static method
(4) Consumer lambda expression reference
(5) Consumer lambda expression "directly in the argument"
*/
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;

public class Program {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		
		double factor = 1.1;
		// (4)
		/*Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice() * factor);
		};*/
		
		list.forEach(  
				/* (1) new PriceUpdate()*/				
				/* (2) Product::staticPriceUpdate*/   
				/* (3) Product::nonStaticPriceUpdate*/ 
				/* (4) cons*/ 
				/* (5)*/p -> p.setPrice(p.getPrice() * factor));
	
		list.forEach(System.out::println);
		}
	}

