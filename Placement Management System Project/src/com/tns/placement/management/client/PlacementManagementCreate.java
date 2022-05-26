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
//			Student student1 = new Student();
//			Student student2 = new Student();
			Placement placement = new Placement();			// object for class Placement
//			Placement placement1 = new Placement();
//			Placement placement2 = new Placement();
			Certificate certificate = new Certificate();	// object for class Certificate
//			Certificate certificate1 = new Certificate();
//			Certificate certificate2 = new Certificate();
			
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
//			student1.setId(2);
//			student1.setName("Maaz");
//			student1.setRoll(12);
//			student1.setQualification("MSc");
//			student1.setCourse("IT");
//			student1.setYear(2022);
//			student1.setHallTicketNo(123457);
//			student2.setId(3);
//			student2.setName("Zayn");
//			student2.setRoll(13);
//			student2.setQualification("PhD");
//			student2.setCourse("Chemistry");
//			student2.setYear(2020);
//			student2.setHallTicketNo(123458);
			
			placement.setId(4); 
			placement.setName("Yasir");
			LocalDate d1 = LocalDate.of(2022, 12, 1);		//using this  for the column date in Table placement
			placement.setDate(d1);
			placement.setQualification("BCA"); 
			placement.setYear(2022);
//			placement1.setId(2); 
//			placement1.setName("Maaz");
//			LocalDate d2 = LocalDate.of(2022, 11, 2);
//			placement1.setDate(d2);
//			placement1.setQualification("MSc"); 
//			placement1.setYear(2022);
//			placement2.setId(3); 
//			placement2.setName("Zayn");
//			LocalDate d3 = LocalDate.of(2020, 9, 3);
//			placement2.setDate(d3);
//			placement2.setQualification("PhD"); 
//			placement2.setYear(2020);
			
			certificate.setId(4);
			certificate.setYear(2022);
//			certificate1.setId(2);
//			certificate1.setYear(2022);
//			certificate2.setId(3);
//			certificate2.setYear(2020);
			
			college.setUser(user);
			college.addStudent1(student);
//			college.addStudent1(student1);
//			college.addStudent1(student2);
			college.addPlacement1(placement);
//			college.addPlacement1(placement1);
//			college.addPlacement1(placement2);
			college.addCertificate1(certificate);
//			college.addCertificate1(certificate1);
//			college.addCertificate1(certificate2);
			student.setCertificate(certificate);
//			student1.setCertificate(certificate1);
//			student2.setCertificate(certificate2);
			certificate.setStudent(student);
//			certificate1.setStudent(student1);
//			certificate2.setStudent(student2);
			
		    service.addUser(user);
			service1.addCollege(college);
			service2.addStudent(student);
//			service2.addStudent(student1);
//			service2.addStudent(student2);
			service3.addPlacement(placement);
//			service3.addPlacement(placement1);
//		    service3.addPlacement(placement2);
			service4.addCertificate(certificate);
//			service4.addCertificate(certificate1);
//			service4.addCertificate(certificate2);
			System.out.println("Data is created successfully........");

		}	
	}