package com.fr.catalogues.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fr.catalogues.entities.Produit;

public interface IProduitRepository extends JpaRepository<Produit, Long> {
	
	public List<Produit> findByDesignation(String des);
	public Page<Produit> findByDesignation(String designation, Pageable p);
	
	@Query("select p from Produit p where designation like :x")
	public Page<Produit> produitParMC(@Param("x")String MC, Pageable p);

}
