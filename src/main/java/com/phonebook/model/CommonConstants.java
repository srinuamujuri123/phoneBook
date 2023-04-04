package com.phonebook.model;

public interface CommonConstants {

	public interface ResponseStatus{
		String SUCCESS = "Success";
		String FAIL = "Fail";
	}
	public interface Phone{
		String SAVE = "Contact saved successfully";
		String UPDATE = "Contact Updated Successfully";
		String ERROR = "Error while saving the City details";
		String DELETED = "Deleted Contact Details sucessfully";
		String UNABLETODELETE = "Oops, Unable to Delete Contact";
		String CONTACTNOTEXIST = "CIty name not existing";
		String LISTNOTFOUND = "Contact List Not Found";
		String LISTFOUND = "Contact List Found";
	}
}
