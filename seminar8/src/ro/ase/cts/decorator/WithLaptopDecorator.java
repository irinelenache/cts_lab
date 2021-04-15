package ro.ase.cts.decorator;

public class WithLaptopDecorator extends AbstractBackpackDecorator{

	public WithLaptopDecorator(AbstractBackpack basicBackpack) {
		super(basicBackpack);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pack() {
		this.basicBackpack.pack();
		System.out.print(" + Laptop");
	}

}
