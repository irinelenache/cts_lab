package ro.ase.cts.seminar1;

import ro.ase.cts.seminar1.exceptii.IllegalTransferException;
import ro.ase.cts.seminar1.exceptii.InsufficientFundsException;

public abstract class Account {
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount) throws InsufficientFundsException;
	public abstract void transfer(double amount, Account destination) throws IllegalTransferException, InsufficientFundsException;
	public abstract double getBalance();
}
