package com.schlesinger.calc.engine;

public class InvalidStatementException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1718885936847701632L;

	public InvalidStatementException() {
		// TODO Auto-generated constructor stub
	}

	public InvalidStatementException(String message, String statement ) {
		super(message + ":" + statement );
		// TODO Auto-generated constructor stub
	}

	public InvalidStatementException(String message, String statement,Throwable cause) {
		super(message + ":" + statement,cause);
		// TODO Auto-generated constructor stub
	}

	/*
	public InvalidStatementException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidStatementException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	*/

}
