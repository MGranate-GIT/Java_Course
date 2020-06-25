package entities;

public class Product  {
	
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	// new solution (3) - static works with Product given as argument
	
	public static boolean staticProdPredicate(Product p) {
		return p.getPrice() >= 100.0;
	}
	
	// new solution (4) - non static works with own object
	
		public boolean nonStaticProdPredicate() {
			return price >= 100.0;
		}
	
	@Override
	public String toString() {
		return name + ", " + price;
	}
	

}
