import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class NegativeBalanceException extends Exception{
	double negativeBalance = 0.0;

	public NegativeBalanceException() {
		super("Error: negative balance");
		
	}
	
	public NegativeBalanceException(double balance) {
		super("Amount exceeds balance by " + balance);
		negativeBalance  = balance;
		PrintWriter out;
		try {
			out = new PrintWriter("logfile.txt");
			out.println("Amount exceeds balance by " + balance);
		} catch (FileNotFoundException e) {
		
			System.out.println("File could not be found");
		}
	}

	@Override
	public String toString() {
		return "Balance of "+ negativeBalance + " not allowed";
	}

	
	public double getNegativeBalance() {
		return negativeBalance;
	}
		
	
		
}
