package ro.ase.cts.seminar1.interfaces;

import ro.ase.cts.seminar1.exceptii.InsufficientFundsException;

public interface Withdrawable {
	public abstract void withdraw(double amount) throws InsufficientFundsException;

}
