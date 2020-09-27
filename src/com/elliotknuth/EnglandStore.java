package com.elliotknuth;

import java.util.HashMap;

public class EnglandStore {
	private HashMap<Integer, Item> items = new HashMap<Integer, Item>();
	private EnglandStoreIterator iterator = new EnglandStoreIterator(items);
	
	public boolean addItem(Item item) {
		if (item != null) {
			items.put(item.getId(), item);
		
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean removeItem(Item item) {
		boolean removed = false;
		
		Integer i = items.remove(item).getId();
		removed = i != null ? true : false;
		
		return removed;
	}
	
	public HashMap<Integer, Item> getItems() {
		return items;
	}
	
	public Item getItem(int id) {
		return items.get(id);
	}
	
	public Iterator getIterator() {
		return iterator;
	}
}
