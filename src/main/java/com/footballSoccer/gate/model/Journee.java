package com.footballSoccer.gate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Journee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "player_Sequence")
	@SequenceGenerator(name = "player_Sequence", sequenceName = "PLAYER_SEQ")
	private Long id;
	
	@Column(name = "NUM_JOURNEE")
	private Long numJournee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumJournee() {
		return numJournee;
	}

	public void setNumJournee(Long numJournee) {
		this.numJournee = numJournee;
	}

	
	
}
