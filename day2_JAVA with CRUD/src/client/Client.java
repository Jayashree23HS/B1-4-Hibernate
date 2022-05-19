package client;

import entities.Student;
import service.StudentService;
import service.StudentServiceImpl;

public class Client {
	
	public static void main (String[] args) {
		StudentService service=new StudentServiceImpl();
		Student student=new Student();
		
		//Crude operation
		//create
		student.setID(50);
		student.setName("hardin");
		service.addStudent(student);
		
		/*/Retrieve data-find();
		student=service.findStudentById(10);
		System.out.println("ID: "+student.getID());
		System.out.println("Name: "+student.getName());
		
		//update
		student=service.findStudentById(10);
		student.setName("noah");
		service.updateStudent(student);
		
		//delete 
		student=service.findStudentById(01);
		service.removeStudent(student);*/

		
	}

}
