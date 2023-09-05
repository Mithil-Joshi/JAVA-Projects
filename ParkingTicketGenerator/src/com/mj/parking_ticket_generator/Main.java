package com.mj.parking_ticket_generator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {	
    	
	    Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the number of vehicles:");
		//Get the number of vehicles
    	int noOfVehicles=sc.nextInt();
    	sc.nextLine();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        
        //Declare ArrayList and get the list of vehicles and add to the array list
        List<Vehicle> vehicleList=new ArrayList<>();
        for(int i=0; i<noOfVehicles; i++) {
    		String[] str=sc.nextLine().split(",");
            Ticket tkt=new Ticket(str[4],sdf.parse(str[5]),Double.parseDouble(str[6]));
            Vehicle veh=new Vehicle(str[0],str[1],str[2],Double.parseDouble(str[3]),tkt);
            vehicleList.add(veh); 
    	}
                       
        System.out.println("Enter a search type:\n1.By type\n2.By parked time");
        int choice = Integer.parseInt(sc.nextLine());
        
        List<Vehicle> obtainedList=new ArrayList<>();
        
        if(choice==1) {
    		System.out.println("Enter the vehicle type:");
			//Get the vehicle type
    		String type=sc.nextLine();
      		
			//Create an object for VehicleBO and call the appropriate method to get the vehciles
			VehicleBO vBO1=new VehicleBO();
			obtainedList=vBO1.findVehicle(vehicleList, type);
			
			if (obtainedList.size() == 0) {
				System.out.println("No such vehicle is present");
			} else {
				System.out.format("%-15s %-10s %-12s %-7s %s\n","Registration No","Name","Type","Weight","Ticket No");
				for (Vehicle vehicle : obtainedList) {
					System.out.format("%-15s %-10s %-12s %-7s %s\n",vehicle.getRegistrationNo(),vehicle.getName(),vehicle.getType(),vehicle.getWeight(),vehicle.getTicket().getTicketNo());
				}
			}		
		}
		else if(choice==2) {
			System.out.println("Enter the parked time:");
			//Get the parked time
			Date time=sdf.parse(sc.nextLine());
			
			//Create an object for VehicleBO and call the appropriate method to get the vehciles
			VehicleBO vBO2=new VehicleBO();  
			obtainedList=vBO2.findVehicle(vehicleList, time);
			
			if (obtainedList.size() == 0) {
				System.out.println("No such vehicle is present");
			} else {
				System.out.format("%-15s %-10s %-12s %-7s %s\n","Registration No","Name","Type","Weight","Ticket No");
				for (Vehicle vehicle : obtainedList) {
					System.out.format("%-15s %-10s %-12s %-7s %s\n",vehicle.getRegistrationNo(),vehicle.getName(),vehicle.getType(),vehicle.getWeight(),vehicle.getTicket().getTicketNo());
				}
			}	
		}
		else if(choice==3){
			System.out.println("Invalid Choice");
            
		}
		else {
			System.out.println("Invalid Choice");
            
		}
		
        sc.close();
	}
}
