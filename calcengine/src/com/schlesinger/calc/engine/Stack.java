package com.schlesinger.calc.engine;

public class Stack<T extends Number> {

	private T[]      elements_ ; 
	private int      size_ ; 
	private static final int DEFAULT_INIT_CAPACITY = 16 ; 
	
	@SuppressWarnings("unchecked")
	public Stack() {
		// TODO Auto-generated constructor stub
		elements_ = (T[]) new Number[ DEFAULT_INIT_CAPACITY ] ; 
	}

	public void push( T o) {
		elements_[ size_++ ] = o ; 
	}
	
	public T pop() {
		T result = elements_[ --size_ ] ; 
		elements_[ size_ ] = null ; 
		return result ; 
	}
	
	public boolean isEmpty() {
		return size_ == 0 ; 
	}
	
}
