package entities;

public class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
		
	}

	public BusinessAccount(Integer number, String holder, Double balace, Double loanLimit) {
		super(number, holder, balace);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if(amount <= loanLimit) {
			balance += balance - 10.0;
		}
	}
	
	@Override
	public void whithdraw(double amount) {
		super.whithdraw(amount);
		balance -= 2;
	}
	

}
