package com.schlesinger.calc.engine;


public class OperationAdd extends Operation {
	static { initialize_static() ; }
	
	public OperationAdd( double l, double r) {
		super(l,r);
		// TODO Auto-generated constructor stub
	}
	
	public OperationAdd() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		return result( lval() + rval() );
	}

	public static void initialize_static() {
		Operation.exemplar.put( MathCommand.Add, new OperationAdd(0,0) ) ;
		
		Operation calculator = Operation.exemplar.get( MathCommand.Add ) ; 
		
		if(calculator == null )
			System.out.println( "WTF" );
		
	}
	
}
