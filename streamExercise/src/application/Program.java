package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			double sal = sc.nextDouble();
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			List<String> emails = list.stream()
					.filter(e -> e.getSalary() > sal)
					.map(e -> e.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			System.out.println("Email of people whose salary is more than " + sal + ": ");
			emails.forEach(System.out::println);
			
			char c = 'M';
			
			double sum = list.stream()
					.filter(e -> e.getName().charAt(0) == c)
					.map(e -> e.getSalary())
					.reduce(0.0, (x, y) -> x + y );
			
			System.out.println("Sum of salary of people whose name starts with '" + c + "' : " + sum);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}








