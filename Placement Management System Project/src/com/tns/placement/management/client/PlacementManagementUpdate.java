package com.tns.placement.management.client;

import java.time.LocalDate;
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

public class PlacementManagementUpdate {
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
			
	
		   //Update
			user = service.searchUserById(1);
			user.setName("Yousuf");
			user.setPassword("Yousuf123");
			service.updateUser(user);
		
			college = service1.searchCollege(1);
			college.setCollegeName("BAMU");
			service1.updateCollege(college);
		
			student = service2.searchStudentById(2);
			student.setName("Aziz");
			student.setQualification("Msc");
			student.setYear(2022);
			service2.updateStudent(student);
		
			placement = service3.searchPlacement(2);
			placement.setName("Aziz");
			placement.setQualification("Msc");
			LocalDate d4 = LocalDate.of(2022, 8, 6);
			placement.setDate(d4);
			placement.setYear(2022);
			service3.updatePlacement(placement);
		
			certificate = service4.searchCertificate(2);
			certificate.setYear(2022);
			service4.updateCertificate(certificate);
		
			student.setCertificate(certificate);
			certificate.setStudent(student);
			System.out.println("Data is updated successfully.......");
			
	}
}

