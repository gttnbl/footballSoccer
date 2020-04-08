package com.footballSoccer.gate.model;

import java.util.List;

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
public class Match {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "team_Sequence")
	@SequenceGenerator(name = "team_Sequence", sequenceName = "TEAM_SEQ")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
	private Team equipeLocale;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_idd")
	private Team equipeVisiteur;
	
	@Column(name = "SCORE")
	private String Score;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "journee_id")
	private Journee journee;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stade_id")
	private Stade stade ;
	
	@OneToMany
	private List<Player> buteurs;
	
	

}
