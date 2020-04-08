package com.footballSoccer.gate.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Staff {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "staff_Sequence")
	@SequenceGenerator(name = "staff_Sequence", sequenceName = "STAFF_SEQ")
	private Long id;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager", nullable = false)
	private Entraineur manager;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "entr_adjoint_princ")
	private Entraineur adjointPrinc;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "entr_adjoint_sec")
	private Entraineur adjointSec;

	
	
	
	public Staff() {
		
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Entraineur getManager() {
		return manager;
	}

	public void setManager(Entraineur manager) {
		this.manager = manager;
	}

	public Entraineur getAdjointPrinc() {
		return adjointPrinc;
	}

	public void setAdjointPrinc(Entraineur adjointPrinc) {
		this.adjointPrinc = adjointPrinc;
	}

	public Entraineur getAdjointSec() {
		return adjointSec;
	}

	public void setAdjointSec(Entraineur adjointSec) {
		this.adjointSec = adjointSec;
	}
	
	
	

}
