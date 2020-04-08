package com.footballSoccer.gate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Pays {

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "pays_Sequence")
	@SequenceGenerator(name = "pays_Sequence", sequenceName = "PAYS_SEQ")
	private Long id;
	
	@Column(name = "NOM_PAYS")
	private String nomPays;
	@Column(name = "CODE_PAYS")
	private String codePays;
	
	
	
	public Pays() {
	
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomPays() {
		return nomPays;
	}
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	public String getCodePays() {
		return codePays;
	}
	public void setCodePays(String codePays) {
		this.codePays = codePays;
	}
	@Override
	public String toString() {
		return "Pays [id=" + id + ", nomPays=" + nomPays + ", codePays=" + codePays + "]";
	}
	
	
}
