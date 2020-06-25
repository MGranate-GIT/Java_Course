package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.UserCode;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<UserCode> set = new HashSet<>();
		
		System.out.print("How many students for course A?: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			int usercode = sc.nextInt();
			set.add(new UserCode(usercode));
		}
		
		System.out.print("How many students for course B?: ");
		n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			int usercode = sc.nextInt();
			set.add(new UserCode(usercode));
		}
		
		System.out.print("How many students for course C?: ");
		n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			int usercode = sc.nextInt();
			set.add(new UserCode(usercode));
		}
		System.out.println("Total students: " + set.size());
			
		
		sc.close();
	}
}
