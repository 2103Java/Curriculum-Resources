package com.example.mystructures.lists;

import com.example.mystructures.RootStructure;

public interface MyList<E> extends RootStructure<E> {
	
	double pi = 3.14;
	
	boolean add(E e, int index);
	
	E get(int index);
	
	int getIndex(E e);
	
	boolean remove(int index);
	
	boolean update(E e, int index);
	
	

}
