package com.schlesinger.calc.engine;

public class CalculateHelper {
	static {
		OperationAdd.initialize_static(); 
		OperationMult.initialize_static(); 
		OperationDiv.initialize_static(); 
		OperationSubtract.initialize_static(); 
	}

	MathCommand command ; 
	double      lhs;
	double      rhs; 
	double      result ; 
	
	public void process( String statement ) throws InvalidStatementException {
		// add 1.0 2.0
		String[] parts = statement.split( " " ) ; 
		
		if( parts.length != 3 )
			throw new InvalidStatementException("Incorrect number of fields", statement );

		try {
			String cmd = parts[0] ; 
		
			lhs = Double.parseDouble( parts[1] ) ;
			rhs = Double.parseDouble( parts[2] ) ; 
		
			setCommandFromString( cmd ) ; 
		
			//
			Operation calculator = Operation.exemplar.get( command ) ; 

			if( calculator == null )
				throw new InvalidStatementException("Invalid command", statement );
			
			calculator.lval(lhs) ; 
			calculator.rval(rhs) ; 

			calculator.calculate() ;
			result = calculator.result() ; 
		} catch( NumberFormatException e ) {
			throw new InvalidStatementException("Invalid number format", statement, e );
		}
		finally {
		}
	}
	
	
	private void setCommandFromString( String commandString ) {

		if( commandString.equalsIgnoreCase( MathCommand.Add.toString() ) ) 
				command = MathCommand.Add ; 
		else if( commandString.equalsIgnoreCase( MathCommand.Subtract.toString() )  ) 
				command = MathCommand.Subtract ; 
		else if( commandString.equalsIgnoreCase( MathCommand.Divide.toString() )  )
				command = MathCommand.Divide ; 
		else if( commandString.equalsIgnoreCase( MathCommand.Multiply.toString() ) ) 
				command = MathCommand.Multiply ;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder(20)  ; 
		sb.append( "result = ") ; 
		sb.append( Double.toString( result ) ) ; 
		
		return  sb.toString(); 
	}
	
	public CalculateHelper() {
		// TODO Auto-generated constructor stub
	}

}
