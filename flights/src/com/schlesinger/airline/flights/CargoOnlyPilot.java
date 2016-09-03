package com.schlesinger.airline.flights;

public class CargoOnlyPilot extends Pilot {

	public CargoOnlyPilot() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canAccept(Flight f) {
		return f.passengers() ==  0 ; 
	}

}
