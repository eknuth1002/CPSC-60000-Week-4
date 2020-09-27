package com.elliotknuth;

public class Runner {

	public static void main(String[] args) {
		//Begin setup of store
		EnglandStore estore = new EnglandStore();
		JapanStore jstore = new JapanStore();
		
		Item item = new Item("English cup", 1.99);
		estore.addItem(item);
		item = new Item("English kettle", 11.99);
		estore.addItem(item);
		item = new Item("English plate", 5.99);
		estore.addItem(item);
		
		item = new Item("Japanese teacup", 2.99);
		jstore.addItem(item);
		item = new Item("Japanese teapot", 15.99);
		jstore.addItem(item);
		item = new Item("Japanese sushi plate", 3.99);
		jstore.addItem(item);
		//End setup of stores
		
		
		System.out.println("We have available:");
		printItems(estore.getIterator());
		printItems(jstore.getIterator());
	}
	
	public static void printItems(Iterator items) {
		while (items.hasNext()) {
			Item item = items.next();
			System.out.println(item.getName() + " costing $" + item.getPrice());
		}
	}

}
