package com.elliotknuth;

public interface Iterator {
	boolean hasNext();
	boolean hasPrevious();
	Item next();
	Item previous();
}
