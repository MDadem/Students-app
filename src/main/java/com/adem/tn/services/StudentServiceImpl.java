package com.adem.tn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adem.tn.entities.Classy;
import com.adem.tn.entities.Student;
import com.adem.tn.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;

	@Override
	public Student addStudent(Student student) {

		return studentRepo.save(student);
	}

	@Override
	public List<Student> getStudents() {

		return studentRepo.findAll();

	}

	@Override
	public Student getStudent(int id) {
		return studentRepo.findById(id).get();
	}

	@Override
	public void deleteStudent(int id) {
		studentRepo.deleteById(id);

	}

	public Student updateStudent(Student student) {
			return studentRepo.save(student);
	}
	

	@Override
	public void deleteStudentById(int id) {
		studentRepo.deleteById(id);

	}

	@Override
	public List<Student> findByFullName(String name) {
	
		return  studentRepo.findByFullName(name);
	}

	@Override
	public List<Student> findByFullNameContains(String name) {
		return  studentRepo.findByFullName(name);
	}

	@Override
	public List<Student> findByClassy(Classy classy) {
			
		return studentRepo.findByClassy(classy);
	}

	@Override
	public List<Student> findByClassyIdClass(int id) {
		return studentRepo.findByClassyIdClass(id);
	}

	@Override
	public List<Student> findByOrderByFullNameAsc() {
		return studentRepo.findByOrderByFullNameAsc();
	}
}
