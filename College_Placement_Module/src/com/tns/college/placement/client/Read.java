package com.tns.college.placement.client;

import com.tns.college.placement.entities.College;
import com.tns.college.placement.entities.Placement;
import com.tns.college.placement.service.CollegeServiceImpl;
import com.tns.college.placement.service.ICollegeService;
import com.tns.college.placement.service.IPlacementService;
import com.tns.college.placement.service.PlacementServiceImpl;

public class Read {
public static void main(String[] args) {
		
		// Creating an object of all entity files
		// Read Operation 
		
				Placement placement = new Placement();
				College college = new College();
				
				IPlacementService service = new PlacementServiceImpl();
				ICollegeService service1 = new CollegeServiceImpl();
	
				placement = service.searchPlacement(1);
				System.out.println(placement.getName());
				System.out.println(placement.getCollege());
				System.out.println(placement.getDate());
				System.out.println(placement.getQualification());
				System.out.println(placement.getYear());
				
	
				college = service1.searchCollege(1);
				System.out.println(college.getCollegeAdmin());
				System.out.println(college.getCollegename());
				System.out.println(college.getLocation());
				System.out.println("Data is retrieved successfully..........");
	}
}
