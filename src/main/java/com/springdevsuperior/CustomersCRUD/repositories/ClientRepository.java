package com.springdevsuperior.CustomersCRUD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springdevsuperior.CustomersCRUD.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
