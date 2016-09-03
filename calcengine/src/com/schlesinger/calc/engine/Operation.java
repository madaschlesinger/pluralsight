package com.schlesinger.calc.engine;

import java.util.HashMap;

public abstract class Operation implements OperationI {

	private double l_      ; 
	private double r_      ; 
	private double result_ ; 
	private static double Invalid = -123456789.876 ; 
	public final static HashMap<MathCommand, Operation> exemplar = new HashMap<MathCommand, Operation>() ;  
	
	public Operation( double l, double r ) {
		l_ = l ; 
		r_ = r ; 
		result_ = Invalid ; 
	}
	
	public Operation() {
		this(0,0) ; 
	}	
	
	double lval()   { return l_ ; }
	double rval()   { return r_ ; }
	double result() { 
		if( result_ == Invalid ) this.calculate() ; 
		return result_ ; 
	} 
	
	double lval(   double v )   { l_ = v; return l_ ; }
	double rval(   double v )   { r_ = v; return r_ ; }
	double result( double r )   { result_ = r ; return result_ ; } 
	
	

}
