package ro.ase.cts.facade;

public class OrderFacade {
	private Waiter myWaiter;
	private Kitchen myKitchen;

	public OrderFacade()
	{
		myWaiter=new Waiter("Gigel");
		myKitchen=new Kitchen();
	}

	public void order()
	{
		myWaiter.takeOrder();
		myWaiter.sendOrderToKitchen();
		myKitchen.prepareFood();
		myKitchen.callWaiter();
		myWaiter.serverCustomer();
		myKitchen.WashDishes();
	}
}
