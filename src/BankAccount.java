/*
 * The class BankAccount stores the balance of the Bank Account then it allows money to be withdrawn
 * if the amount is in the BankAccount otherwise it throws a negative balance amount exception, one with a message including the balance and the other
 * without the balance included.
 * Authors: Araceli Siedschlag, Gwen Sabol
 * Date: 10/5/2025
 */


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
