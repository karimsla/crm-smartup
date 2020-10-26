package org.sid.dao;

import org.sid.entities.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ClientRepository extends JpaRepository<Client,Long> {
	
	@Query("select c from Client c where (c.nom like:x)")
	public Page<Client> findByDesignationContains(@Param("x")String mc, Pageable pageable);
	
	@Query("select c from Client c where (c.username like:x)")
	public Client ChercherClientusername(@Param("x")String username);
	
	@Query("select c from Client c where (c.mail like:x)")
	public Client findbymail(@Param("x")String mail);
	
	
}