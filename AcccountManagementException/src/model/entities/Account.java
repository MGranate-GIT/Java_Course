package model.entities;

import model.exceptions.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double limit;
		
	public Account(Integer number, String holder, Double balance, Double limit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.limit = limit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getLimit() {
		return limit;
	}

	public void setLimit(Double limit) {
		this.limit = limit;
	}

	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) {
		if (amount > limit) {
			throw new DomainException("The amount exceeds the withdraw limit");
		} 
		if (amount > balance) {
			throw new DomainException("Not enough balance");
		}
		balance -= amount;
	}
	
	@Override
	public String toString() {
		return "New balance: "
				+ balance;
	}
	

}
	
	
