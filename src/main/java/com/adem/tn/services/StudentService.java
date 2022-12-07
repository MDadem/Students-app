package com.adem.tn.services;

import java.util.List;

import com.adem.tn.entities.Classy;
import com.adem.tn.entities.Student;

public interface StudentService {

	Student addStudent(Student student);

	List<Student> getStudents();

	void deleteStudent(int id);

	Student updateStudent(Student student);

	void deleteStudentById(int id);

	Student getStudent(int id);

	List<Student> findByFullName(String name);

	List<Student> findByFullNameContains(String name);

	List<Student> findByClassy(Classy classy);

	List<Student> findByClassyIdClass(int id);

	List<Student> findByOrderByFullNameAsc();

}
