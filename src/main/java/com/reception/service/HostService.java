package com.reception.service;

import java.util.Date;
import java.util.List;

import com.reception.dto.HostDTO;
import com.reception.model.Hosts;
import com.reception.model.Visitors;


public interface HostService {
	
	Hosts save(Hosts host);
	public List<Hosts> findAll();
	void saveHost(HostDTO host);
	
    public  List<Hosts> findByHostname(String hostname);

}
