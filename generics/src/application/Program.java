// Benefits of Generics:
// 1 - Reuse
// 2 - Type safety
// 3 - Performance

package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService<String/*Integer*/> ps = new PrintService</*Type optional*/>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String/*Integer*/ value = sc.next();/*sc.nextInt();*/
			ps.addValue(value);   /*Not nextLine()*/
		}

		ps.print();
		String/*Integer*/ x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();
	}
}