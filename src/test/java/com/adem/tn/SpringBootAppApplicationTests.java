package com.adem.tn;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adem.tn.entities.Classy;
import com.adem.tn.entities.Student;
import com.adem.tn.repositories.StudentRepository;

@SpringBootTest
class SpringBootAppApplicationTests {
	@Autowired
	private StudentRepository studentRepository;

//	@Test
//	public void testFindByNomStudent() {
//		List<Student> stud = studentRepository.findByFullName("ali");
//		for (Student p : stud) {
//			System.out.println(p);
//		}
//	}
//	@Test
//	public void testFindByNomStudentContains() {
//		List<Student> stud = studentRepository.findByFullNameContains("ali");
//		for (Student p : stud) {
//			System.out.println(p);
//		}
//	}
//	@Test
//	public void testfindByClassy() {
//		Classy cl = new Classy();
//		cl.setIdClass(1);
//		List<Student> stud = studentRepository.findByClassy(cl);
//		for (Student p : stud) {
//			System.out.println(p);
//		}
//	}
//	@Test
//	public void findByClassyIdClass() {
//		List<Student> std = studentRepository.findByClassyIdClass(1);
//		for (Student p : std) {
//			System.out.println(p);
//		}
//	}

//	@Test
//	public void testfindByOrderByFullNameAsc() {
//		List<Student> std = studentRepository.findByOrderByFullNameAsc();
//		for (Student p : std) {
//			System.out.println(p);
//		}
//	}

}
