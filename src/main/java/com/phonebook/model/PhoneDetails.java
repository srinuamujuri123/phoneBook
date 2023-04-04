package com.phonebook.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ContactDetails")
public class PhoneDetails extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String phoneNumber;
	String name;
	

}
