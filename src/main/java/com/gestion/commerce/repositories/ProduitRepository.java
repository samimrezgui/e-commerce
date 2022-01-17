package com.gestion.commerce.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.gestion.commerce.entities.Produit;
@RepositoryRestResource(path= "produits")
public interface ProduitRepository extends JpaRepository<Produit, Long> {
	public List<Produit> findByNomContains(String nom);
	
	
}
