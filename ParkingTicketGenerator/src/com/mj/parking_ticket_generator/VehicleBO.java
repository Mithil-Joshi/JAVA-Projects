package com.mj.parking_ticket_generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VehicleBO{
    
	public List<Vehicle> findVehicle(List<Vehicle> vehicleList,String type){
		//Fill your code here
		List<Vehicle> givenList = new ArrayList<>();
		givenList=vehicleList;
		String givenType = type;
		List<Vehicle> reqdList = new ArrayList<>();
		
		for (Vehicle vehicle : givenList) {
			if (vehicle.getType().equals(givenType)) {
				reqdList.add(vehicle);
			}
		}
	
        return reqdList;
	}
	
	public List<Vehicle> findVehicle(List<Vehicle> vehicleList,Date parkedTime){
		//Fill your code here
		List<Vehicle> givenList = new ArrayList<>();
		givenList=vehicleList;
		Date givenTime = parkedTime;
		List<Vehicle> reqdList = new ArrayList<>();
		
		for (Vehicle vehicle : givenList) {
			if (vehicle.getTicket().getParkedTime().equals(givenTime)) {
				reqdList.add(vehicle);
			}
		}
		
        return reqdList;
	}
}

