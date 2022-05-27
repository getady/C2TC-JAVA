package com.tns.college.placement.client;

import java.time.LocalDate;

import com.tns.college.placement.entities.College;
import com.tns.college.placement.entities.Placement;
import com.tns.college.placement.service.CollegeServiceImpl;
import com.tns.college.placement.service.ICollegeService;
import com.tns.college.placement.service.IPlacementService;
import com.tns.college.placement.service.PlacementServiceImpl;

public class Create {

	public static void main(String[] args) {
		
		// Creating an object of all entity files
		// Create Operation 
		
				Placement placement = new Placement();
				College college = new College();
				
				IPlacementService service = new PlacementServiceImpl();
				ICollegeService service1 = new CollegeServiceImpl();
				
			
				placement.setId(1); 
				placement.setName("Yasir");
				LocalDate d1 = LocalDate.of(2022, 12, 1);		//using this  for the column date in Table placement
				placement.setDate(d1);
				placement.setQualification("BCA"); 
				placement.setYear(2022);
				
				college.setId(1);
				college.setCollegeAdmin("Mj"); 
				college.setCollegename("BBMJ");
				college.setLocation("Aurangabad");
					
				service.addPlacement(placement);
				service1.addCollege(college);
				System.out.println("Data created successfully..........");
				
				
			}

}
