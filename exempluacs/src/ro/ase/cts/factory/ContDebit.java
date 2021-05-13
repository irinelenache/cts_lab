package ro.ase.cts.factory;

public class ContDebit implements ContBancar{

	private double total = 1000;
	
	@Override
	public void transfer(ContBancar destinatie, double suma) {
		total -= suma;
		destinatie.depune(suma);
		System.out.println(suma + " lei au fost adaugati in " + destinatie + " - cont Debit");
		
	}

	@Override
	public void depune(double suma) {
		total+= suma;
		System.out.println(suma + "lei au fost adaugati in contul curent - cont Debit");
	}

	@Override
	public String toString() {
		return "ContDebit [total=" + total + "]";
	}

	
}
