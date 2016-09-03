package com.schlesinger.airline.flights;

public class Flight {
	
	private int  passengers_ ; 
	private int  seats_      ; 
	private int  number_     ; 
	private char class_      ; 
	
	{
		seats_ = 150 ; 
	}
	
	public Flight() {
	}
	
	public Flight( int fn ) {
		number_ = fn ; 
	}
	
	public int flight( int f ) { number_ = f ; return number_ ; }
	
	public int passengers() {
		return passengers_ ; 
	}
	
	public int add1passenger() {
		if (passengers_ < seats_ )
			passengers_ +=2 ;
		else
			handleTooMany() ; 
		
		return passengers_ ; 
	}
	
	private void handleTooMany() {
		System.out.println( "flight is full!" );
	}
	
	
	public boolean hasRoom( Flight f2 ) {
		return (this.passengers_ + f2.passengers_) <= this.seats_  ; 
	}
	
	@Override
	public boolean equals( Object o ) {
		if (! (o instanceof Flight ) ) return false ; 
		
		if( super.equals( o ) ) return true ; // if the reference equality is correct - then just return
		
		Flight that = (Flight) o ; 
		
		return this.number_ == that.number_ && this.class_ == that.class_ ;  // ignore other fields
	}

	@Override
	public String toString() { // comes from Object.toString() 
		if( number_ > 0 )  return "Flight #"     + number_ ; 
		else               return "Flight class " + class_ ; 
	
	}
} // class 
