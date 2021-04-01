package ro.ase.cts.seminar6.singleton;

public class EagerShoppingCartExample {
	public static final EagerShoppingCartExample INSTANCE;

	static {
		INSTANCE = new EagerShoppingCartExample();
	}
	
	private EagerShoppingCartExample() {}
}
