package ro.ase.cts.facade;

public class Waiter {

	String name;

	public Waiter(String name) {
		super();
		this.name = name;
	}

	public void takeOrder()
	{
		System.out.println("Order taken");
	}

	public void sendOrderToKitchen() {
		System.out.println("Order placed");
	}

	public void serverCustomer()
	{
		System.out.println("Customer served");
	}
}
