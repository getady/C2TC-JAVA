package com.tns.college.placement.client;

import java.time.LocalDate;

import com.tns.college.placement.entities.College;
import com.tns.college.placement.entities.Placement;
import com.tns.college.placement.service.CollegeServiceImpl;
import com.tns.college.placement.service.ICollegeService;
import com.tns.college.placement.service.IPlacementService;
import com.tns.college.placement.service.PlacementServiceImpl;

public class Update {

public static void main(String[] args) {
		
		// Creating an object of all entity files
	    // Update Operation 
		
				Placement placement = new Placement();
				College college = new College();
				
				IPlacementService service = new PlacementServiceImpl();
				ICollegeService service1 = new CollegeServiceImpl();
	
				college = service1.searchCollege(1);
				college.setCollegename("BAMU");
				service1.updateCollege(college);
			
			
				placement = service.searchPlacement(2);
				placement.setName("Aziz");
				placement.setQualification("Msc");
				LocalDate d4 = LocalDate.of(2022, 8, 6);
				placement.setDate(d4);
				placement.setYear(2022);
				service.updatePlacement(placement);
				System.out.println("Data is updated successfully.......");
				
	}
}
