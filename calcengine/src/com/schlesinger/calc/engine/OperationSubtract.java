package com.schlesinger.calc.engine;

public class OperationSubtract extends Operation {

	static { initialize_static() ;  }
	
	public OperationSubtract(double l, double r) {
		super(l, r);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return result( lval() - rval() );
	}
	
	public static void initialize_static() {
		Operation.exemplar.put(MathCommand.Subtract, new OperationSubtract(0,0) ) ;
	}
}
