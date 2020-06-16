package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.taxPayer;
import entities.company;
import entities.individual;


public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<taxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual Income: ");
			double annualIncome = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Health Expendures: ");
				double healthExpendures= sc.nextDouble();
				list.add(new individual(name, annualIncome, healthExpendures));
			}
			else {
				System.out.print("Number of Employees: ");
				int nrOfEmployees= sc.nextInt();
				list.add(new company(name, annualIncome, nrOfEmployees));
			}
			}
		
		
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (taxPayer taxPayer : list) {
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.taxesPaid()));
			
		}
		
		double sum = 0.0;
		for (taxPayer taxPayer : list) {
			sum += taxPayer.taxesPaid();
		}
		System.out.println();
		System.out.print("TOTAL TAXES: " + String.format("%.2f", sum));
		
		
		sc.close();
		
	}
	
	}


