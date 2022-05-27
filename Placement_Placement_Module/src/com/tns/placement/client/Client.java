package com.tns.placement.client;

import com.tns.placement.entities.Placement;
import com.tns.placement.service.IPlacementService;
import com.tns.placement.service.PlacementServiceImpl;

public class Client {

	public static void main(String[] args) 
	{
		
		// CRUD operation calling activity 
		IPlacementService service = new PlacementServiceImpl();
		Placement placement = new Placement();

//		// create operation 
		placement.setId(106);
		placement.setName("Muhammad");
		placement.setCollege("Azad College");
		placement.setDate("10th April");
		placement.setQualification("Bsc");
		placement.setYear(2022);

		service.addPlacement(placement);
		System.out.println("data add successfully........");
		
//		// Retrieve
//		placement = service.searchPlacement(102);
//		System.out.println("Id:"+placement.getId());
//		System.out.println("Name:"+placement.getName());	
//		System.out.println("College Name:"+placement.getCollege());
//		System.out.println("Qualification:"+placement.getQualification());
	
		
//		// Update
//		placement = service.searchPlacement(100);
//		placement.setName("Ady Al Kaseri");
//		placement.setCollege("UDMS BAMU");
//		placement.setDate("2nd October");
//		placement.setQualification("MCA");
//		placement.setYear(2021);
//		service.updatePlacement(placement);
//		
//		System.out.println("Update is successful....");
		
//		//at this breakpoint, we have updated record added in first section
//		 placement = service.searchPlacement(100);
//		 System.out.print("ID:"+placement.getId());
//		 System.out.println("Name:"+placement.getName());
//		 System.out.println("College Name :" + placement.getCollege());
//		 System.out.println("Date : " + placement.getDate());
//		 System.out.println("Qualification : " + placement.getQualification());
//		 System.out.println("Year : " + placement.getYear());
		
		
		
//		// Delete Operation
//		placement = service.searchPlacement(106);
//		service.cancelPlacement(placement);
//		System.out.println("Record is Deleted successfully......");


        
		
	}

}