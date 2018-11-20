package com.reception.controller;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.reception.model.Events;
import com.reception.repository.EventRepository;
import com.reception.serviceimpl.EventServiceImpl;



@RunWith(MockitoJUnitRunner.class)
public class EventControllerTest{
	@InjectMocks
	EventController eventController;
	@InjectMocks
	EventServiceImpl eventService;
	@Mock
	EventRepository eventrepo;
	
	Events event;
//	final String eventname=" ";
	
	
	
		private Events getEvents(){
		
		 event=new Events();
		
		event.setEventid(1);
		event.setEvent_name("birthday");
		event.setDate("12-10-2018");
		event.setRoomno("12");
		System.out.println("items are"+">..................................."+event);
		return event;
		}
		
	   
		

	
	@Test   // here we are mocking the database .that it restricts the operation with database.
	        // we are making a method and we  already defined its result and it returned.
	public void testGetEvents(){
		Events s= new Events();
		when(eventrepo.findByEventname(anyString())).thenReturn(Arrays.asList(getEvents()));//here we are mocked the database conection
		assertEquals(1, eventService.findByName("").size());//one object is created and it is returned.
		
		
	}
	@Test
	public void testAssert(){
		when(eventrepo.findByEventname(anyString())).thenReturn(Arrays.asList(getEvents()));
		assertNotNull(getEvents());
		assertEquals("birthday", event.getEventname());
		assertEquals(1, event.getEventid());
		
	
		
	}
}
	
	
	
	
	
	
	
	
	
