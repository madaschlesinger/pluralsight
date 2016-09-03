package com.schlesinger.airline.flights;

public class Passenger implements Comparable {
	
	// allows us to use java sort ( Array.sort( passengers ) )

	private int memberLevel ; // 3 (first priority ), 2, 1, 
	private int memberDays  ; // how long have they been freq flier members
	
	public int compareTo( Object o ) {
		Passenger p = (Passenger) o;
	
		if( memberLevel > p.memberLevel )
			return -1 ; 
		if( memberLevel < p.memberLevel )
			return 1 ; 
		else if( memberDays > p.memberDays )
			return - 1; 
		else
			return 1; 
	}
}
