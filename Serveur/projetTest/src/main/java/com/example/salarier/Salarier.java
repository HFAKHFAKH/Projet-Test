package com.example.salarier;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "salarier")
public class Salarier {

	@Id
	@GeneratedValue
	private Integer id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private double salaire;

	public Salarier() {
		super();
	}

	public Salarier(Integer id, String nom, String prenom, Date dateNaissance, double salaire) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.salaire = salaire;
	}

	public final Integer getId() {
		return id;
	}

	public final void setId(Integer id) {
		this.id = id;
	}

	public final String getNom() {
		return nom;
	}

	public final void setNom(String nom) {
		this.nom = nom;
	}

	public final String getPrenom() {
		return prenom;
	}

	public final void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public final Date getDateNaissance() {
		return dateNaissance;
	}

	public final void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public final double getSalaire() {
		return salaire;
	}

	public final void setSalaire(double salaire) {
		this.salaire = salaire;
	}

}
