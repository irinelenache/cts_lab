package ro.ase.cts.seminar1;

import ro.ase.cts.seminar1.exceptii.IllegalTransferException;
import ro.ase.cts.seminar1.exceptii.InsufficientFundsException;

public class Main {

	public static void main(String[] args) {

		CurrentAccount c = new CurrentAccount(300, "IBAN1");
		CurrentAccount account2 = new CurrentAccount(200, "IBAN2");
		System.out.println("suma disponibila este: " + c.getBalance());
		
		System.out.println("Creditul maxim pt un cont curent este " + CurrentAccount.MAX_CREDIT);
		
		
		SavingsAccount account3 = new SavingsAccount(300, "IBAN3");
		c.deposit(200);
		System.out.println("suma disponibila este: " + c.getBalance());
		
		try {
			c.withdraw(200);
			c.transfer(100, account2);
		} catch (InsufficientFundsException | IllegalTransferException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		System.out.println("suma disponibila este: " + c.getBalance());
		
		System.out.println("suma in contul 2 este " + account2.getBalance());

		System.out.println("Suma in contul 3 este " + account3.getBalance());
		account3.addInterest(30);
		System.out.println("Suma in contul 3 este " + account3.getBalance());
		
		Bank banca = new Bank();
		
		BankAccount account4 = banca.openBankAccount(1);
		
	}

}
