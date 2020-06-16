
package application;

	import java.text.ParseException;
import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.Date;
	import java.util.List;
	import java.util.Scanner;

	import entities.product;
	import entities.usedProduct;
	import entities.importedProduct;


	public class program {

		public static void main(String[] args) throws ParseException {
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			
			Scanner sc = new Scanner(System.in);
			
			List<product> list = new ArrayList<>();
			
			System.out.print("Enter the number of products:");
			int n = sc.nextInt();
			
			for (int i=1; i<=n; i++) {
				System.out.println("Product #" + i + " data: ");
				System.out.print("Common, used or imported (c/u/i)? ");
				char ch = sc.next().charAt(0);
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();

				if (ch == 'i') {
					System.out.print("Customs fee: ");
					double customsFee= sc.nextDouble();
					list.add(new importedProduct(name, price, customsFee));
				}
				else if(ch == 'u') {
					System.out.print("Manufacture date: ");
					Date manufactureDate= sdf.parse(sc.next());
					list.add(new usedProduct(name, price, manufactureDate));
				}
				else {
					list.add(new product(name, price));

				}
			
			}
			
			
			System.out.println();
			System.out.println("PRICE TAGS: ");
			for (product product : list) {
				System.out.println(product.priceTag());
			}
			sc.close();
			
		}
		
			
	}


