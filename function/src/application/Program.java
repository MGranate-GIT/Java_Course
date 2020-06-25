/*
(1) Function with interface implementation
(2) Function with reference method with static method
(3) Function with reference method with non static method
(4) Function lambda expression declared
(5) Function lambda expression "directly in the argument"
*/
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		Function<Product, String> func = p -> p.getName().toUpperCase();
				
		List<String> names = list.stream().map(  
				/* (1) new UpperCaseName()).collect(Collectors.toList()*/
		        /* (2) Product::staticUpperCaseName).collect(Collectors.toList()*/
				/* (3) Product::nonStaticUpperCaseName).collect(Collectors.toList()*/
				/* (4) func).collect(Collectors.toList()*/
				/* (5)*/ p -> p.getName().toUpperCase()).collect(Collectors.toList());
				 
		names.forEach(System.out::println);
	
		}
	}

