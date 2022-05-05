package com.cg.jpacrud.client;

import com.cg.jpacrud.entities.Student;
import com.cg.jpacrud.service.StudentService;
import com.cg.jpacrud.service.StudentServiceImpl;

		public class Client {

			public static void main(String[] args) {

				//Debug this program as Debug -> Debug as Java Application
				
				StudentService service = new StudentServiceImpl();
				
			
				Student student = new Student();
				
				 // Create Operation
				student.setStudentid(102);
				student.setName("habibi");
				service.addStudent(student);
				
				
				//at this breakpoint, we have added one record to table
				// Retrieve Operation
				student = service.findStudentById(102);
				System.out.print("ID:"+student.getStudentid());
				System.out.println(" Name:"+student.getName()); // habibi
			
				 
				// Update Operation
				student = service.findStudentById(102);
				student.setName("Yasir Bin-Mazi");
				service.updateStudent(student);
				
				//at this breakpoint, we have updated record added in first section
				
				student = service.findStudentById(102);
				System.out.print("ID:"+student.getStudentid());
				System.out.println(" Name:"+student.getName());  // Yasir Bin-Mazi
				
			
				//at this breakpoint, record is removed from table
				// Delete Operation
				
				student = service.findStudentById(105);
				service.removeStudent(student);
				System.out.println("End of program/Life cycle completed...");  
			
			
	}
}		

