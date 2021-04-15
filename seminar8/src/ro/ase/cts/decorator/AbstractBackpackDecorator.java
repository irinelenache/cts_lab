package ro.ase.cts.decorator;

public abstract class AbstractBackpackDecorator extends AbstractBackpack{
	protected AbstractBackpack basicBackpack;

	public AbstractBackpackDecorator(AbstractBackpack basicBackpack) {
		super();
		this.basicBackpack = basicBackpack;
	}
	
	
}
