
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
