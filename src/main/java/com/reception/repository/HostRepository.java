package com.reception.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.reception.model.Hosts;
import com.reception.model.Visitors;


@Repository
public interface HostRepository extends JpaRepository<Hosts,Integer>{
	
   public Hosts save(Hosts host);
	 public List<Hosts> findAll();
	
	 public List<Hosts> findByHostname(String hostname);


}
