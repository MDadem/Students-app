package com.adem.tn.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Student {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idStudent ;
	private String fullName ;
	private String cin ;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@ManyToOne
//	 @JoinColumn(name="classy_id_class", nullable=false)
	private Classy classy;
	
	
	public Student() {
		super();
	}
	public Student(int idStudent, String fullName, String cin, Gender gender , List<Classy> classys) {
		super();
		this.idStudent = idStudent;
		this.fullName = fullName;
		this.cin = cin;
		this.gender = gender;
	}
	public Classy getClassy() {
		return classy;
	}
	public void setClassy(Classy classy) {
		this.classy = classy;
	}
	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	
	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", fullName=" + fullName + ", cin=" + cin + ", gender=" + gender
				+ "]";
	}
	
	
}
