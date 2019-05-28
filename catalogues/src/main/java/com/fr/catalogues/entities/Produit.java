package com.fr.catalogues.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long reference;
	private String designation;
	private double prix;
	private Long categorie_id;
	
	
	public Produit(String designation, double prix) {
		super();
		this.designation = designation;
		this.prix = prix;
	}
	public Long getReference() {
		return reference;
	}
	public void setReference(Long reference) {
		this.reference = reference;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCategorie_id() {
		return categorie_id;
	}
	public void setCategorie_id(Long categorie_id) {
		this.categorie_id = categorie_id;
	}
	public Produit(String designation, double prix, Long categorie_id) {
		super();
		this.designation = designation;
		this.prix = prix;
		this.categorie_id = categorie_id;
	}

	

}
