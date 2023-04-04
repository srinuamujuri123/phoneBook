package com.phonebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phonebook.model.PhoneDetails;
import com.phonebook.model.TMSResponse;
import com.phonebook.service.PhoneService;

@RestController
@RequestMapping("/phone")
public class PhoneController {
	@Autowired
	PhoneService phoneService;
	
	@PostMapping("/save-contact-details")
	public TMSResponse saveContactDetails(@RequestBody PhoneDetails phoneDetails ){
		return phoneService.saveContactDetails(phoneDetails);
	}

}
