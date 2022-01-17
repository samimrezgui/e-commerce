package com.gestion.commerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gestion.commerce.entities.Categorie;
@RepositoryRestResource(path= "categories")

public interface CategorieRepository extends JpaRepository<Categorie,Long > {

}
