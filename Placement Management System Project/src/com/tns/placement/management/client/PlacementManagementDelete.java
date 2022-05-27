package com.tns.placement.management.client;

import com.tns.placement.management.entities.Certificate;
import com.tns.placement.management.entities.College;
import com.tns.placement.management.entities.Placement;
import com.tns.placement.management.entities.Student;
import com.tns.placement.management.entities.User;
import com.tns.placement.management.service.CertificateServiceImpl;
import com.tns.placement.management.service.CollegeServiceImpl;
import com.tns.placement.management.service.ICertificateService;
import com.tns.placement.management.service.ICollegeService;
import com.tns.placement.management.service.IPlacementService;
import com.tns.placement.management.service.IStudentService;
import com.tns.placement.management.service.IUserService;
import com.tns.placement.management.service.PlacementServiceImpl;
import com.tns.placement.management.service.StudentServiceImpl;
import com.tns.placement.management.service.UserServiceImpl;



public class PlacementManagementDelete {
	public static void main(String[] args) {
		 
		
			User user = new User();							// object for class User
			College college = new College();				// object for class College
			Student student = new Student();				// object for class Student
			Placement placement = new Placement();			// object for class Placement
			Certificate certificate = new Certificate();	// object for class Certificate

			
			IUserService service = new UserServiceImpl();				// object for calling the JPACRUD operations in User
			ICollegeService service1 = new CollegeServiceImpl();		// object for calling the JPACRUD operations in College
			IStudentService service2 = new StudentServiceImpl();		// object for calling the JPACRUD operations in Student
			IPlacementService service3 = new PlacementServiceImpl();	// object for calling the JPACRUD operations in Placement
			ICertificateService service4 = new CertificateServiceImpl();// object for calling the JPACRUD operations in Certificate
		
			//Delete
			user = service.searchUserById(1);
			college = service1.searchCollege(1);
			student = service2.searchStudentById(1);
			placement = service3.searchPlacement(3);
			certificate = service4.searchCertificate(3);
			
			service.deleteUser(user);
			service1.deleteCollege(college);
			service2.deleteStudent(student);
			service3.deletePlacement(placement);
			service4.deleteCertificate(certificate);
			System.out.println("Delete is performed successfully........");
			
				
			
	}
}