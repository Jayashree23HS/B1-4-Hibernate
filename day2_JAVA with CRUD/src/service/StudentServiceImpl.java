package service;

import dao.StudentDao;
import dao.StudentDaoImp;
import entities.Student;


public class StudentServiceImpl implements StudentService
{
	private StudentDao dao;
	
	public StudentServiceImpl()
	{
		dao=new StudentDaoImp();
	}

	@Override
	public void addStudent(Student student) {
		dao.beginTranscation();
		dao.addStudent(student);
		dao.commitTranscation();
		
	}

	@Override
	public Student findStudentById(int ID) {
		Student student=dao.getStudentById(ID);
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		dao.beginTranscation();
		dao.updateStudent(student);
		dao.commitTranscation();
		
	}

	@Override
	public void removeStudent(Student student) {
		dao.beginTranscation();
		dao.removeStudent(student);
		dao.commitTranscation();
		
	}
	
}
