
public class BankAccount {
	private double balance;
	
	public BankAccount(double Balance) {
		this.balance=Balance;
	}
	
	public void withdraw(double withdrawAmount) throws NegativeBalanceException{
		if (withdrawAmount > balance) {
			double negativeBalance = balance - withdrawAmount;
			throw new NegativeBalanceException(negativeBalance);
		} else {
			balance = balance - withdrawAmount;
		}
	}
	
	public void quickWithdraw(double withdrawAmount) throws NegativeBalanceException{
		if (withdrawAmount > balance) {
			throw new NegativeBalanceException();
		} else {
			balance = balance - withdrawAmount;
		}
	}
}
