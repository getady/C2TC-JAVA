package com.tns.college.placement.client;

import com.tns.college.placement.entities.College;
import com.tns.college.placement.entities.Placement;
import com.tns.college.placement.service.CollegeServiceImpl;
import com.tns.college.placement.service.ICollegeService;
import com.tns.college.placement.service.IPlacementService;
import com.tns.college.placement.service.PlacementServiceImpl;

public class Delete {
public static void main(String[] args) {
		
		// Creating an object of all entity files
		// Delete Operation 
		
				Placement placement = new Placement();
				College college = new College();
				
				IPlacementService service = new PlacementServiceImpl();
				ICollegeService service1 = new CollegeServiceImpl();
				
				placement = service.searchPlacement(1);
				college = service1.searchCollege(1);
				
				service.deletePlacement(placement);
				service1.deleteCollege(college);
				
	}
}
