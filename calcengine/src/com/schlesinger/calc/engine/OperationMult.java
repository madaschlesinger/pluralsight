package com.schlesinger.calc.engine;

public class OperationMult extends Operation {
	static { initialize_static() ; }
	
	public OperationMult(double l, double r) {
		super(l, r);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return result( lval() * rval() );
	}

	public static void initialize_static() {
		Operation.exemplar.put( MathCommand.Multiply, new OperationMult(0,0) ) ;
	}
}
