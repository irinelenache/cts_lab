package ro.ase.cts.composite;

import java.util.ArrayList;

public class ProductCatalog extends CatalogComponent{


	private ArrayList<CatalogComponent> products;
	private String name;

	public ProductCatalog(String name) {
		super();
		products=new ArrayList<CatalogComponent>();
		this.name = name;
	}

	@Override
	public void add(CatalogComponent component) {
		// TODO Auto-generated method stub
		this.products.add(component);

	}

	@Override
	public void remove(CatalogComponent component) {
		// TODO Auto-generated method stub
		for(int i=0;i<products.size();i++)
		{
			if(products.get(i).getName().equals(component.getName()))
			{
				products.remove(i);
			}
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public double GetPrice() {
		throw new UnsupportedOperationException("Can't get price");
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.name).append(":\n");
		for(CatalogComponent component : this.products) {
			builder.append(component.toString());
		}
		return builder.toString();
	}

}