package com.fr.catalogues.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fr.catalogues.dao.IProduitRepository;
import com.fr.catalogues.entities.Produit;

@RestController
public class CatalogueController {
	
	@Autowired
	private IProduitRepository produitRepository;
	
	
	@RequestMapping("/test")
	public String test(){
		return "test";
	}
	@RequestMapping("/save")
	public Produit saveProduit(Produit p){
		produitRepository.save(p);
		return p;
	}
	@RequestMapping("/all")
	public List<Produit> getProduits(){
		return produitRepository.findAll();
	}
	
	@RequestMapping("/produits")
	public Page<Produit> getProduitByPage(int page, int size){
		return produitRepository.findAll(new PageRequest(page, size));
	}
	@RequestMapping("/produitsParMC")
	public Page<Produit> produitParMC(String mc, int page, int size){
		return produitRepository.produitParMC("%"+mc+"%", new PageRequest(page, size));
	}
	@RequestMapping("/get")
	public Produit getProduit(Long ref){
		return produitRepository.findOne(ref);
	}
	@RequestMapping("/delete")
	public boolean deleteProduit(Long ref){
		produitRepository.delete(ref);
		return true;
	}
	@RequestMapping("/update")
	public Produit update(Produit p){
		produitRepository.save(p);
		return p;
	}

}
