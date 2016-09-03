package com.schlesinger.airline.flights;

public abstract class Pilot {
	
	private Flight currentFlight ; 
	
	public void fly( Flight f ) {
		
		if( canAccept(f) ) 
			currentFlight = f ; 
		else 
			handleCantAccept() ;
		return ; 
		}

	public abstract boolean canAccept(Flight f)  ; 
	
	public void handleCantAccept() {
		System.out.println( "cant accept flight" );
	}
}
