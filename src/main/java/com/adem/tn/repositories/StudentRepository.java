package com.adem.tn.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.adem.tn.entities.Classy;
import com.adem.tn.entities.Student;

@RepositoryRestResource(path = "rest")
public interface StudentRepository extends JpaRepository<Student, Integer> {
	List<Student> findByFullName(String name);

	@Query("select p from Student p where p.classy = ?1")
	List<Student> findByClassy (Classy classy);
	List<Student> findByClassyIdClass(int id);
	List<Student> findByOrderByFullNameAsc();
	

}
