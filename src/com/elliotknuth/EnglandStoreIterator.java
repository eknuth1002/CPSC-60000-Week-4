package com.elliotknuth;

import java.util.HashMap;

public class EnglandStoreIterator implements Iterator {
	private HashMap<Integer, Item> items;
	private int position = 0;
	
	private EnglandStoreIterator() {	}
	
	public EnglandStoreIterator(HashMap<Integer, Item> items) { this.items = items; }
	
	@Override
	public boolean hasNext() {
		return items.size() > position ? true : false;
	}

	@Override
	public boolean hasPrevious() {
		return position == 0 ? true : false;
	}

	@Override
	public Item next() {
		Item[] item =  items.values().toArray(new Item[items.size()]);
		if (position < items.size() && item.length > position) {
			return item[position++];
		}
		else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	@Override
	public Item previous() {
		Item[] item = items.values().toArray(new Item[items.size()]);
		if (position != 0 && item.length > position) {
			return item[position--];
		}
		else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

}
