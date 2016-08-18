package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.service.RegisterService;

@Component
public class RegistrationHandler {

	public RegistrationDetails  startFlow() {
		return new RegistrationDetails();
	}
	
	@Autowired 
	RegisterService regser;
	
	public  void saveRegister(RegistrationDetails regDetails){
		
		regser.saveOrUpdate(regDetails);
		
	}

	
}
