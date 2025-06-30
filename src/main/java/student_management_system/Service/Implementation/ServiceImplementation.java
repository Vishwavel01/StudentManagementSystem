package student_management_system.Service.Implementation;

import java.rmi.StubNotFoundException;
import java.util.List;

import org.springframework.stereotype.Service;

import student_management_system.Exception.StudentNotFoundException;
import student_management_system.Service.StudentService;
import student_management_system.entity.Student;
import student_management_system.repositary.StudentRepositary;

@Service
public class ServiceImplementation implements StudentService {
	
	StudentRepositary studentRepositary;

	public ServiceImplementation(StudentRepositary studentRepositary) {
		this.studentRepositary = studentRepositary;
	}

	@Override
	public List<Student> getAllStudents(){
		// TODO Auto-generated method stub
		return studentRepositary.findAll();

	}

	@Override
	public Student getStudentById(int rollNo) {
		// TODO Auto-generated method stub
		if(studentRepositary.findById(rollNo).isEmpty())
			throw new StudentNotFoundException("Student with RollNo " + rollNo + " is not exist");
		return studentRepositary.findById(rollNo).get();
	}

	@Override
	public String createStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepositary.save(student);
		return "Created Succesfully";
	}

	@Override
	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepositary.save(student);
		return "Updated Successfully";
	}
	
	@Override
	public String deleteStudentById(int rollNo) {
		// TODO Auto-generated method stub
		studentRepositary.deleteById(rollNo);
		return "Deleted Successfully";
	}

}