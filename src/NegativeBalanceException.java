/*
 * The class NeagtiveBalanceException extends exception and prints one of two errors relating to
 * their bank balance. When called with the balance it gives the specific amount of money that withdraw exceed for the account
 * then prints it and writes the error message to the log file. The other options, prints a general error message with no specifications on
 * the specific bank amount.
 * Authors: Araceli Siedschlag, Gwen Sabol
 * Date: 10/5/2025
 */

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
			out.close();
		} catch (FileNotFoundException e) {
		
			System.out.println("File could not be found");
		}
	}

	@Override
	public String toString() {
		return "Balance of "+ negativeBalance + " not allowed";
	}
	
		
}
