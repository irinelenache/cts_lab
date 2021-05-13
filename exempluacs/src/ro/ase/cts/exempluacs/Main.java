package ro.ase.cts.exempluacs;

import ro.ase.cts.adapter.AdapterCont;
import ro.ase.cts.adapter.BankAccount;
import ro.ase.cts.factory.ContBancar;
import ro.ase.cts.single.SingleBanca;

public class Main {

	public static void main(String[] args) {

		SingleBanca singleBanca = SingleBanca.getInstance("BCR",  "Centru");
		
		ContBancar contBancar1 = singleBanca.createInstance("CREDIT");
		ContBancar contBancar2 = singleBanca.createInstance("DEBIT");
		
		System.out.println(contBancar1);
		System.out.println(contBancar2);
		
		System.out.println(SingleBanca.NRCONTURI);
		
		ContBancar adapterCont = new AdapterCont();
		BankAccount bankAccount = new AdapterCont();
		
		adapterCont.transfer(contBancar1, 200);
		adapterCont.depune(500);
		((BankAccount) adapterCont).accountTransfer(bankAccount, 200);
	}

}
