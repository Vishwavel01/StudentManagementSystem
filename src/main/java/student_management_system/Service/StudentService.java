package student_management_system.Service;

import java.util.List;

import student_management_system.entity.Student;

public interface StudentService {
	
	public List<Student> getAllStudents();
	
	public Student getStudentById(int rollNo);
	
	public String createStudent(Student student);
	
	public String updateStudent(Student student);
	
	public String deleteStudentById(int rollNo);
	

}
