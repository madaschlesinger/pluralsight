package com.schlesinger.airline.flights;

public class CargoFlight extends Flight {

	float  maxCargoSpace  = 1000.0f;
	double usedCargoSpace = 0 ; 
	
	public CargoFlight() {}
	
	public CargoFlight( int fn ) {
		super(fn); 
	}
	
	public CargoFlight( int fn, float space ) {
		this(fn); 
		this.maxCargoSpace = space ; 
	}
	
	public final double add1Package( float h, float w, float d ) {
		double sz = h*w*d ; 
		
		if( hasCargoSpace( sz ) ) usedCargoSpace += sz ; 
		else                      handleHasNoSpace() ; 
		
		return usedCargoSpace ; 
	}
	
	
	private boolean hasCargoSpace( double sz ) {
		
		if( sz + this.usedCargoSpace < this.maxCargoSpace ) return true  ;
		else                                                return false ;
	}
	
	private void handleHasNoSpace() {
		System.out.println( "No Space");
	}

}
