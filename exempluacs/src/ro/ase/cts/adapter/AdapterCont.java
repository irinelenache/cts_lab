package ro.ase.cts.adapter;

import ro.ase.cts.factory.ContBancar;

public class AdapterCont implements BankAccount, ContBancar{

	private double total = 500;
	
	@Override
	public void transfer(ContBancar destinatie, double suma) {
		total -= suma;
		destinatie.depune(suma);
		System.out.println(suma + " lei au fost adaugati in " + destinatie + " - cont Debit");		
	}

	@Override
	public void depune(double suma) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accountTransfer(BankAccount account, double amount) {
		this.transfer(this, amount);		
	}

}
