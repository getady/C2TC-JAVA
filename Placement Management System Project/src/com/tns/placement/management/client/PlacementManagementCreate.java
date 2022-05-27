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



	public class PlacementManagementCreate {
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
				
			// Create Operation
	   	    user.setId(2);
		    user.setName("Nuzair");
			user.setPassword("@Nuzair");
	      	user.setType("College Admin");
			
			college.setId(1); 
			college.setCollegeName("BBMJ");
			college.setLocation("Aurangabad");
			
			student.setId(4);
			student.setName("Yasir");
			student.setRoll(11);
			student.setQualification("BCA");
			student.setCourse("CS");
			student.setYear(2022);
			student.setHallTicketNo(123459);

			
			placement.setId(4); 
			placement.setName("Yasir");
			LocalDate d1 = LocalDate.of(2022, 12, 1);		//using this  for the column date in Table placement
			placement.setDate(d1);
			placement.setQualification("BCA"); 
			placement.setYear(2022);

			
			certificate.setId(4);
			certificate.setYear(2022);

			
			college.setUser(user);
			college.addStudent1(student);
			college.addPlacement1(placement);
			college.addCertificate1(certificate);
			student.setCertificate(certificate);
			certificate.setStudent(student);

			
		    service.addUser(user);
			service1.addCollege(college);
			service2.addStudent(student);
			service3.addPlacement(placement);
			service4.addCertificate(certificate);

			System.out.println("Data is created successfully........");

		}	
	}