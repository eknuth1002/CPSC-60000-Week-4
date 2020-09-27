package com.elliotknuth;

import java.util.ArrayList;

public class JapanStore {
	private ArrayList<Item> items = new ArrayList<Item>();
	private JapanStoreIterator iterator = new JapanStoreIterator(items);
	
	public boolean addItem(Item item) {
		if (item != null) {
			return items.add(item);
		}
		else {
			return false;
		}
	}
	
	public boolean removeItem(Item item) {
		return items.remove(item);
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public Item getItem(int index) {
		return items.get(index);
	}

	public Iterator getIterator() {
		return iterator;
	}
}
