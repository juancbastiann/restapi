package com.ug.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ug.restapi.models.Cliente;

@RepositoryRestResource(path = "clientes", collectionResourceRel = "clientes")
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    
}
