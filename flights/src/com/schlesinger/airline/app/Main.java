package com.schlesinger.airline.app;

import com.schlesinger.airline.flights.Flight;
import com.schlesinger.airline.flights.CargoFlight;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( "Flight:" );
		
		Flight       f = new Flight() ; 
		CargoFlight cf = new CargoFlight() ; 
		
		f.flight( cf.flight( 22 ) ) ; 
		
		System.out.println( f.add1passenger() );
		System.out.println( cf.add1Package(20, 3, 4) );

		
		// f.showSum( 1.3f,  3.5f, 3);
		System.out.println( "equals ? " + f.equals( cf ) );
	}

}
