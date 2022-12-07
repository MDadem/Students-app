package com.adem.tn.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.adem.tn.entities.Classy;
import com.adem.tn.repositories.ClassyRepository;
@RestController
@RequestMapping("/api/class")
@CrossOrigin("*")
public class ClassyController {
@Autowired
ClassyRepository classyRepository;
@RequestMapping(method=RequestMethod.GET)
public List<Classy> getAllClassys()
{
return classyRepository.findAll();
}
@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Classy getClassyById(@PathVariable("id") int id) {
return classyRepository.findById(id).get();
}
}
