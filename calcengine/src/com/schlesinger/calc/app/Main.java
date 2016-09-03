package com.schlesinger.calc.app;

import com.schlesinger.calc.engine.CalculateHelper;
import com.schlesinger.calc.engine.InvalidStatementException;
//import com.schlesinger.calc.engine.MathEquation;
//import com.schlesinger.calc.engine.Operation;
//import com.schlesinger.calc.engine.Stack;


public class Main {

	public static boolean firsttime = true ; 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// useMathEquation() ; 
		// useCalculator()   ; 
		
		String[] statements = {
				//"add 1.0",
				//"add 1.0XX 2.0",
				//"addx 1.0 2.0",
				"divide 100 50.0",
				"add 25.0 92.0",
				"subtract 225.0 17.0",
				"multiply 11.0 3.0"
		} ; 
		
		CalculateHelper helper = new CalculateHelper() ; 
		for(String s: statements ) {
			try {
				helper.process(s) ;
				System.out.println( helper);
			}
			catch( InvalidStatementException e ) {
				System.out.println(e.getMessage() );
				
				if( e.getCause() != null ) {
					System.out.println(e.getCause().getMessage() );
						
				}
			}
			
		}	
			
	}		

	
}




/*
double[] lvals = { 100.0d, 25.0d, 225.0d, 11.0d };
double[] rvals = { 50.0d, 92.0d, 17.0d, 3.0d };
char[]   ops   = { 'd', 'a', 's', 'm' };
double[] results = new double[ops.length]; 
for( int i = 0; i < ops.length ; ++ i ) {
	switch( ops[i] ) {
	case 'a' :  
		results[i] = lvals[i] + rvals[i] ; 
		break;
	case 's' :
		results[i] = lvals[i] - rvals[i] ; 
		break;
	case 'd' :
		results[i] = lvals[i] / rvals[i] ; 
		break;
	case 'm' :
		results[i] = lvals[i] * rvals[i] ; 
		break;

	default :
		System.out.println( "Invalid opCode || values!" );
		results[i] = 0 ; 
		break;
	}
}

for( double result: results )  {
	System.out.println( result );
}

float [] vals = { 10.0f, 20.0f, 15.0f } ; 
float sum = 0 ; 

for( float curr: vals )
	sum += curr ;

	System.out.println( sum ) ;
	
	
	
	
	
public static void useMathEquation() {

		MathEquation[] eqs = new com.schlesinger.calc.engine.MathEquation[5]; 
		eqs[0] = create_equation( 100.0d, 50.0d, 'd' ) ; 
		eqs[1] = create_equation( 25.0d,  92.0d, 'a' ) ; 
		eqs[2] = create_equation( 225.0d, 17.0d, 's' ) ; 
		eqs[3] = create_equation( 11.0d,   3.0d, 'm' ) ; 
		eqs[4] = create_equation( 11.0d,   3.0d, 'm' ) ; 
		
		for( MathEquation eq : eqs ) {
			eq.execute();
			System.out.println( "result = " + eq.result) ;
		}	
		
		// double result = MathEquation.operations(eqs) ; 
		// System.out.println( "Sum    = " + result) ;
		
		System.out.println( "Operation:" +  eqs[4].equals(eqs[3] ) ) ;
	}
		
	public static void useCalculator() {
		
		Operation[] calculators = {
				new OperationDiv( 100.0d, 50.0d),
				new OperationAdd( 25.0d,  92.0d  ) ,
				new OperationSubtract( 225.0d, 17.0d ) , 
				new OperationMult( 11.0d,   3.0d )  
		} ; 
		
		for( Operation calculator : calculators )
		{
			// calculator.calculate();
			System.out.println( "result = " + calculator.result() ) ;	
		}
		
		com.schlesinger.calc.engine.Stack<Integer> s = new Stack<Integer>(); 
		boolean empty = s.isEmpty()  ;
		System.out.println( "Is it empty? " + s.isEmpty() );
		
		s.push( 4 );
		Integer aa = 5; 
		s.push( aa );

		System.out.println( "Is it empty? " + s.isEmpty() );

		
	}
	
	public static MathEquation create_equation( double l, double r, char o ) 
	{
		return new MathEquation(o, l, r) ; 
	}	
	
	
	
	
	
	
	
	
	
	*/