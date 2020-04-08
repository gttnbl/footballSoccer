package com.footballSoccer.gate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Entraineur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "team_Sequence")
	@SequenceGenerator(name = "team_Sequence", sequenceName = "ENTRAINEUR_SEQ")
	private Long id;
	
	@Column(name = "FIRST_NAME")
	private String firstname;
	
	@Column(name = "LAST_NAME")
	private String lastName;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	

}
