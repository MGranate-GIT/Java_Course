package entities;

public class company extends taxPayer{

	private Integer nrOfEmployees;
	
	public company() {
		super();
	}

	
	public company(String name, Double annualIncome, Integer nrOfEmployees) {
		super(name, annualIncome);
		this.nrOfEmployees = nrOfEmployees;
	}


	public Integer getNrOfEmployees() {
		return nrOfEmployees;
	}


	public void setNrOfEmployees(Integer nrOfEmployees) {
		this.nrOfEmployees = nrOfEmployees;
	}


	@Override
	public double taxesPaid() {
		if (getNrOfEmployees() <= 10 ) {
			return getAnnualIncome() * 0.16;
			}
		else {
			return getAnnualIncome() * 0.14;
		}
	}

}