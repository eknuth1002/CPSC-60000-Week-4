package com.elliotknuth;

import java.util.ArrayList;

public class JapanStoreIterator implements Iterator {
	private ArrayList<Item> items;
	private int position = 0;
	
	private JapanStoreIterator() {	}
	
	public JapanStoreIterator(ArrayList<Item> items) { this.items = items; }
	
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
		if (position < items.size()) {
			return items.get(position++);
		}
		else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	@Override
	public Item previous() {
		if (position != 0) {
			return items.get(position--);
		}
		else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
}
