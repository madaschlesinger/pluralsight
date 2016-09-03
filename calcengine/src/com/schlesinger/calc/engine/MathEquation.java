package com.schlesinger.calc.engine;

public class MathEquation  {

	double lval; 
	double rval; 
	double result ; 
	char   op ; 
	
	public MathEquation( char o, double l, double r ) {
		lval   = l ;
		rval   = r ; 
		result = 0 ; 
		op     = o ; 
				
	}
	
	public double execute( double l, double r ) {
		switch(this.op) {
		case 'a' :  
			result = l + r ; 
			break;
		case 's' :
			result = l - r ; 
			break;
		case 'd' :
			result = l / r ; 
			break;
		case 'm' :
			result = l * r ; 
			break;

		default :
			System.out.println( "Invalid opCode || values!" );
			result = 0 ; 
			break;
		}

		return this.result ; 
	}
	
	public double execute() {
		return this.execute(this.lval,this.rval) ; 
	}
	
	@Override
	public boolean equals( Object o ) {
		if( ! ( o instanceof MathEquation ) ) return false ; 
		
		MathEquation f = (MathEquation) o; 
		return this.op == f.op && this.lval == f.lval && this.rval == f.rval ; 
	}
	
	
	static public double operations( MathEquation... equations ) 
	{
		double result = 0 ; 
		for( MathEquation e: equations ) {
			result += e.execute(); 
		}
		return result ; 
	}
}
