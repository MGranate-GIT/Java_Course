package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import service.ContractService;
import service.PaypalService;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double contractValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, contractValue);

		System.out.print("Enter number of installments: ");
		int installements = sc.nextInt();

		ContractService contractService = new ContractService(new PaypalService());

		contractService.processContract(contract, installements);

		
		System.out.println("Installments:");
		for (Installment x : contract.getInstallments()) {
			System.out.println(x);
		}
		
		sc.close();
		
	}


}
