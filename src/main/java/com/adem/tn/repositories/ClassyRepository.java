package com.adem.tn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.adem.tn.entities.Classy;
import com.adem.tn.entities.Student;

@RepositoryRestResource(path = "class")
@CrossOrigin(origins = "http://localhost:4200/")
public interface ClassyRepository extends JpaRepository<Classy, Integer> {

}



