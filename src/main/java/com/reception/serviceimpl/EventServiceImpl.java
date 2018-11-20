package com.reception.serviceimpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reception.model.Events;
import com.reception.repository.EventRepository;
import com.reception.service.EventService;
@Service


public class EventServiceImpl implements EventService{
  @Autowired
  EventRepository eventrepo;
  @Autowired
  EventService eventservice;
  
	@Override
	public Events save(Events event) {
		
		return eventrepo.save(event);
	}

	
	@Override
	public List<Events> findByName(String eventname) {
		
		return eventrepo.findByEventname(eventname);
	}

	@Override
	public List<Events> findByDate(String date) {
		
		return eventrepo.findByDate(date);
	}

	@Override
	public List<Events> findByRoomno(String roomno) {
		
		return eventrepo.findByRoomno(roomno);
	}


	@Override
	public List<Events> findAll() {
		
		return eventrepo.findAll();
	}


	@Override
	public void deleteUserBy(Integer eventid) {
		eventrepo.delete(eventid);
	}


	@Override
	public Events update(Events event) {
		
		return eventrepo.save(event);
	}




		

	


	





	



}
