package ro.ase.cts.seminar8;

import ro.ase.cts.composite.CatalogComponent;
import ro.ase.cts.composite.Product;
import ro.ase.cts.composite.ProductCatalog;
import ro.ase.cts.decorator.AbstractBackpack;
import ro.ase.cts.decorator.Backpack;
import ro.ase.cts.decorator.WithFoodDecorator;
import ro.ase.cts.decorator.WithLaptopDecorator;
import ro.ase.cts.facade.OrderFacade;

public class Main {

	public static void main(String[] args) {
		OrderFacade facade=new OrderFacade();
		facade.order();
		
		System.out.println("------------------");

		CatalogComponent laptop = new Product("Asus", 2000);
		CatalogComponent smartphone = new Product("Samsung S20", 3500);
		
		CatalogComponent techProductsCatalog = new ProductCatalog("Tech products");
		techProductsCatalog.add(laptop);
		techProductsCatalog.add(smartphone);
		
		CatalogComponent officeProductCatalog = new ProductCatalog("Office products");
		CatalogComponent paperclip = new Product("Paperclip", 5);
		CatalogComponent pen = new Product("Blue pen", 2);
		officeProductCatalog.add(paperclip);
		officeProductCatalog.add(pen);
	
		CatalogComponent genericProducts = new ProductCatalog("Generic products");
		genericProducts.add(new Product("Generic product", 0));
		genericProducts.add(techProductsCatalog);
		genericProducts.add(officeProductCatalog);
		
		
		System.out.println(genericProducts);
		
		System.out.println("--------------------------");
		
		AbstractBackpack myBackpack = new Backpack();
		myBackpack.pack();
		System.out.println("\n");
		AbstractBackpack decoratedBackpack = new WithLaptopDecorator(new WithFoodDecorator(myBackpack, "banana"));
		
		decoratedBackpack.pack();
	}

}
