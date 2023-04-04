package com.phonebook.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonebook.dao.PhoneDao;
import com.phonebook.model.CommonConstants.Phone;
import com.phonebook.model.PhoneDetails;
import com.phonebook.model.TMSResponse;
import com.phonebook.service.PhoneService;
@Service
public class PhoneServiceImpl implements PhoneService {
	@Autowired
	PhoneDao phoneDao;

	@Override
	public TMSResponse saveContactDetails(PhoneDetails phoneDetails) {
		TMSResponse response = new TMSResponse();
		try {
			PhoneDetails phoneDetailsDB = saveContact(phoneDetails);
			phoneDetails.setActive(true);
			response.setData(phoneDetailsDB);
			response.setDetails(Phone.SAVE);
		} catch (Exception e) {
			response.setErrorMessage("unable to save data");
		}
		return response;
	}

	public PhoneDetails saveContact(PhoneDetails phoneDetails) {
		return phoneDao.save(phoneDetails);
	}
}
