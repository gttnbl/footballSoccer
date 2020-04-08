package com.footballSoccer.gate.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Stade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "stade_Sequence")
	@SequenceGenerator(name = "stade_Sequence", sequenceName = "STADE_SEQ")
	private Long id;
	private String nom;
	private Long num_supporteur;
	private Date date_construction;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Long getNum_supporteur() {
		return num_supporteur;
	}
	public void setNum_supporteur(Long num_supporteur) {
		this.num_supporteur = num_supporteur;
	}
	public Date getDate_construction() {
		return date_construction;
	}
	public void setDate_construction(Date date_construction) {
		this.date_construction = date_construction;
	} 

}
