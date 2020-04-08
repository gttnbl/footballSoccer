package com.footballSoccer.gate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class Competition {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "player_Sequence")
	@SequenceGenerator(name = "player_Sequence", sequenceName = "PLAYER_SEQ")
	private Long id;
	@Column(name = "NOM")
	private String nom;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
	private Team vainquer;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id", insertable = false, updatable = false)
	private Player buteur;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id")
	private Player assist;

}
