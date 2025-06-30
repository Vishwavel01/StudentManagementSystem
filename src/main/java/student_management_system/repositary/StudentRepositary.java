package student_management_system.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import student_management_system.entity.Student;

public interface StudentRepositary extends JpaRepository<Student, Integer>{

}
