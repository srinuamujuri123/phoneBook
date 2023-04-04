package com.phonebook.service;

import com.phonebook.model.PhoneDetails;
import com.phonebook.model.TMSResponse;

public interface PhoneService {

	TMSResponse saveContactDetails(PhoneDetails phoneDetails);

}
