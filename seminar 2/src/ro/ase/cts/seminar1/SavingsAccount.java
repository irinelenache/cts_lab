package ro.ase.cts.seminar1;

import ro.ase.cts.seminar1.exceptii.IllegalTransferException;
import ro.ase.cts.seminar1.exceptii.InsufficientFundsException;
import ro.ase.cts.seminar1.interfaces.Depositable;
import ro.ase.cts.seminar1.interfaces.Profitable;
import ro.ase.cts.seminar1.interfaces.Transferable;
import ro.ase.cts.seminar1.interfaces.Withdrawable;

public class SavingsAccount extends BankAccount implements Profitable, Depositable, Withdrawable, Transferable{

	@Override
	public void deposit(double amount) {
		this.balance += amount;
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(amount <=this.balance) {
			this.balance -= amount;
		}
	}

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(double balance, String iban) {
		super(balance, iban);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void transfer(double amount, Depositable destination)
			throws IllegalTransferException, InsufficientFundsException {
		if(((BankAccount)destination).iban.equals(this.iban)) {
			throw new IllegalTransferException("conturile coincid");
		}
		else {
			this.withdraw(amount);
			destination.deposit(amount);
		}
	}

	@Override
	public void addInterest(double interest) {
		this.balance *= (1 + interest/100);
	}

}
