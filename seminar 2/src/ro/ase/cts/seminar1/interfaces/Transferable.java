package ro.ase.cts.seminar1.interfaces;

import ro.ase.cts.seminar1.Account;
import ro.ase.cts.seminar1.exceptii.IllegalTransferException;
import ro.ase.cts.seminar1.exceptii.InsufficientFundsException;

public interface Transferable {
	public abstract void transfer(double amount, Depositable destination) throws IllegalTransferException, InsufficientFundsException;
}
