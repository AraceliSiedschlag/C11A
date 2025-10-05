/*
 * The class ATM creates a BankAccount with 500 dollars then tests the BankAccount methods
 * to see what happens when more money is withdrawn then is in the account. It also has the main method
 * to create and call the ATM.
 * Authors: Araceli Siedschlag, Gwen Sabol
 * Date: 10/5/2025
 */



public class ATM {
	BankAccount account;

	public ATM() {
		this.account = new BankAccount(500);
	}
	
	public void handleTransactions() {
		try {
			account.withdraw(600);
		} catch(NegativeBalanceException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			
		}
		try {
			account.quickWithdraw(600);
		} catch(NegativeBalanceException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			
		}
	}
	
	public static void main(String[] parameters) {
		ATM atm = new ATM();
		atm.handleTransactions();	
	}
}
