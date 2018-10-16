package com.example.model;

public class Societe {
	int id, nbreSalarier, plafond;
	String nom;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNbreSalarier() {
		return nbreSalarier;
	}

	public void setNbreSalarier(int nbreSalarier) {
		this.nbreSalarier = nbreSalarier;
	}

	public int getPlafond() {
		return plafond;
	}

	public void setPlafond(int plafond) {
		this.plafond = plafond;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Societe [id=" + id + ", nbreSalarier=" + nbreSalarier + ", plafond=" + plafond + ", nom=" + nom + "]";
	}
}
