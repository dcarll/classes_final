package entities;

public class SavingdAccountPlus extends SavingsAccount{
	
	@Override
	public void whithdraw(double amount) {
		balance -= amount;
	}

}
