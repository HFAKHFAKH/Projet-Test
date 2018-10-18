package com.example.societe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "societe")
public class Societe {

	@Id
	@GeneratedValue
	private Integer id;
	private String nom;
	private Integer nbresalarier;
	private double plafond;

	public Societe() {
		super();
	}

	public Societe(Integer id, String nom, Integer nbresalarier, double plafond) {
		super();
		this.id = id;
		this.nom = nom;
		this.nbresalarier = nbresalarier;
		this.plafond = plafond;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getNbresalarier() {
		return nbresalarier;
	}

	public void setNbresalarier(Integer nbresalarier) {
		this.nbresalarier = nbresalarier;
	}

	public double getPlafond() {
		return plafond;
	}

	public void setPlafond(double plafond) {
		this.plafond = plafond;
	}

}
