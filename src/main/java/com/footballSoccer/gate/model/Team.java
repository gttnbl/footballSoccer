package com.footballSoccer.gate.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "team_Sequence")
	@SequenceGenerator(name = "team_Sequence", sequenceName = "TEAM_SEQ")
	private Long id;

	@Column(name = "NAME")
	private String name;

	/*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "team")
	private List<Player> players; */

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "staff_id", nullable = false)
	private Staff staff;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "stade_id", nullable = false)
	private Stade stade;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pays_id", nullable = false)
	private Pays pays;

	public Team() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Stade getStade() {
		return stade;
	}

	public void setStade(Stade stade) {
		this.stade = stade;
	}

	
}
