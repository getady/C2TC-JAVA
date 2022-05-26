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


public class PlacementManagementRead {

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
				
		
			//Retrieval
			user = service.searchUserById(1);
			System.out.println(user.getName());
			System.out.println(user.getType());
			System.out.println(user.getPassword());
		
			college = service1.searchCollege(1);
			System.out.println(college.getUser());
			System.out.println(college.getCollegeName());
			System.out.println(college.getLocation());
		
			student = service2.searchStudentById(1);
			System.out.println(student.getName());
			System.out.println(student.getCollege());
			System.out.println(student.getRoll());
			System.out.println(student.getQualification());
			System.out.println(student.getCourse());
			System.out.println(student.getYear());
			System.out.println(student.getCertificate());
			System.out.println(student.getHallTicketNo());
		
			placement = service3.searchPlacement(1);
			System.out.println(placement.getName());
			System.out.println(placement.getCollege());
			System.out.println(placement.getDate());
			System.out.println(placement.getQualification());
			System.out.println(placement.getYear());
		
			certificate = service4.searchCertificate(1);
			System.out.println(certificate.getYear());
			System.out.println(certificate.getCollege());
			System.out.println("Data is retrieved successfully........");
		
	}
}

