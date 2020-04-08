package com.footballSoccer.gate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.footballSoccer.gate.model.enums.Position;

@Entity
public class Player {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="player_Sequence")
	@SequenceGenerator(name = "player_Sequence", sequenceName = "player_Sequence", allocationSize = 1)
	private Long id;

	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "NUM")
	private int num;
	
	@Column(name = "VALEUR")
	private Long valeur;
	
	
	@ManyToOne
    @JoinColumn(name = "pays_id")
	private Pays nationalite; 

	@Column(name = "POSITION")
	private Position position;
	
	/*@ManyToOne
    @JoinColumn(name = "team_id")
    private Team team; */
	
	public Player() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Long getValeur() {
		return valeur;
	}

	public void setValeur(Long valeur) {
		this.valeur = valeur;
	}

	public Pays getNationalite() {
		return nationalite;
	}

	public void setNationalite(Pays nationalite) {
		this.nationalite = nationalite;
	}

	

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	
	

	

	
	

		
}
