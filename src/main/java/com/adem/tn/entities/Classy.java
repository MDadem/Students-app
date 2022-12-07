package com.adem.tn.entities;

import javax.persistence.ManyToOne;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Classy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idClass;
	private String nomClass;
	private String descriptionClass;
	@JsonIgnore
	@OneToMany(mappedBy = "classy")
	private List<Student>students;




//@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
//private Long idCat;
//private String nomCat;
//private String descriptionCat;
//@JsonIgnore
//@OneToMany(mappedBy = "categorie")
//private List<Student> students;

}
